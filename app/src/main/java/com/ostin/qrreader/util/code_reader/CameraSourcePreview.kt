package com.ostin.qrreader.util.code_reader


/**
 * Author: Sergey Ostrovsky
 * Date: 23.05.20
 * Email: sergey.ostrovsky.it.dev@gmail.com
 */
import android.Manifest
import android.content.Context
import android.content.res.Configuration
import android.util.AttributeSet
import android.util.Log
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.ViewGroup
import androidx.annotation.RequiresPermission
import com.google.android.gms.common.images.Size
import com.google.android.gms.vision.CameraSource
import java.io.IOException


class CameraSourcePreview(
    private val mContext: Context,
    attrs: AttributeSet?
) :
    ViewGroup(mContext, attrs) {
    private val mSurfaceView: SurfaceView
    private var mStartRequested = false
    private var mSurfaceAvailable = false
    private var mCameraSource: CameraSource? = null
    // private lateinit var mOverlay: GraphicOverlay<*>
    private var mOverlay: GraphicOverlay<BarcodeGraphic>? = null

    @RequiresPermission(Manifest.permission.CAMERA)
    @Throws(IOException::class, SecurityException::class)
    fun start(cameraSource: CameraSource?) {
        if (cameraSource == null) {
            stop()
        }
        mCameraSource = cameraSource
        if (mCameraSource != null) {
            mStartRequested = true
            startIfReady()
        }
    }

//    @RequiresPermission(Manifest.permission.CAMERA)
//    @Throws(IOException::class, SecurityException::class)
    // fun start(cameraSource: CameraSource?, overlay: GraphicOverlay<*>) {
    /*fun start(cameraSource: CameraSource?, overlay: GraphicOverlay<BarcodeGraphic>?) {
        mOverlay = overlay
        start(cameraSource)
    }*/

    fun stop() {
        if (mCameraSource != null) {
            mCameraSource?.stop()
        }
    }

    fun release() {
        if (mCameraSource != null) {
            mCameraSource?.release()
            mCameraSource = null
        }
    }

    @RequiresPermission(Manifest.permission.CAMERA)
    @Throws(IOException::class, SecurityException::class)
    private fun startIfReady() {
        if (mStartRequested && mSurfaceAvailable) {
            mCameraSource?.start(mSurfaceView.holder)
            if (mOverlay != null) {
                val size: Size = mCameraSource!!.getPreviewSize()
                val min = Math.min(size.width, size.height)
                val max = Math.max(size.width, size.height)
                if (isPortraitMode) {
                    // Swap width and height sizes when in portrait, since it will be rotated by
                    // 90 degrees
                    mOverlay?.setCameraInfo(min, max, mCameraSource!!.getCameraFacing())
                } else {
                    mOverlay?.setCameraInfo(max, min, mCameraSource!!.getCameraFacing())
                }
                mOverlay?.clear()
            }
            mStartRequested = false
        }
    }

    private inner class SurfaceCallback : SurfaceHolder.Callback {
        override fun surfaceCreated(surface: SurfaceHolder) {
            mSurfaceAvailable = true
            try {
                startIfReady()
            } catch (se: SecurityException) {
                Log.e(
                    TAG,
                    "Do not have permission to start the camera",
                    se
                )
            } catch (e: IOException) {
                Log.e(
                    TAG,
                    "Could not start camera source.",
                    e
                )
            }
        }

        override fun surfaceDestroyed(surface: SurfaceHolder) {
            mSurfaceAvailable = false
        }

        override fun surfaceChanged(
            holder: SurfaceHolder,
            format: Int,
            width: Int,
            height: Int
        ) {
        }
    }

    override fun onLayout(
        changed: Boolean,
        left: Int,
        top: Int,
        right: Int,
        bottom: Int
    ) {
        var width = 320
        var height = 240
        if (mCameraSource != null) {
            val size: Size = mCameraSource!!.getPreviewSize()
            if (size != null) {
                width = size.width
                height = size.height
            }
        }

        // Swap width and height sizes when in portrait, since it will be rotated 90 degrees
        if (isPortraitMode) {
            val tmp = width
            width = height
            height = tmp
        }
        val layoutWidth = right - left
        val layoutHeight = bottom - top

        // Computes height and width for potentially doing fit width.
        var childWidth = layoutWidth
        var childHeight =
            (layoutWidth.toFloat() / width.toFloat() * height).toInt()

        // If height is too tall using fit width, does fit height instead.
        if (childHeight > layoutHeight) {
            childHeight = layoutHeight
            childWidth = (layoutHeight.toFloat() / height.toFloat() * width) as Int
        }
        for (i in 0 until childCount) {
            getChildAt(i).layout(0, 0, childWidth, childHeight)
        }
        try {
            startIfReady()
        } catch (se: SecurityException) {
            Log.e(
                TAG,
                "Do not have permission to start the camera",
                se
            )
        } catch (e: IOException) {
            Log.e(
                TAG,
                "Could not start camera source.",
                e
            )
        }
    }

    private val isPortraitMode: Boolean
        private get() {
            val orientation = mContext.resources.configuration.orientation
            if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                return false
            }
            if (orientation == Configuration.ORIENTATION_PORTRAIT) {
                return true
            }
            Log.d(
                TAG,
                "isPortraitMode returning false by default"
            )
            return false
        }

    companion object {
        private const val TAG = "CameraSourcePreview"
    }

    init {
        mSurfaceView = SurfaceView(mContext)
        mSurfaceView.holder.addCallback(SurfaceCallback())
        addView(mSurfaceView)
    }
}