package com.ostin.qrreader.home.tabs.list

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.GoogleApiAvailability
import com.google.android.gms.vision.CameraSource
import com.google.android.gms.vision.barcode.BarcodeDetector
import com.ostin.qrreader.databinding.FragmentListBinding
import java.io.IOException

class ListFragment : Fragment() {
    private var binding:FragmentListBinding? = null

    private val RC_HANDLE_GMS = 9001

    private var mCameraSource: CameraSource? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(inflater, container, false)

        val autoFocus = true
        val useFlash = true
        createCameraSource(autoFocus, useFlash)

        return binding!!.root
    }

    /**
     * Creates and starts the camera.  Note that this uses a higher resolution in comparison
     * to other detection examples to enable the barcode detector to detect small barcodes
     * at long distances.
     *
     * Suppressing InlinedApi since there is a check that the minimum version is met before using
     * the constant.
     */
    @SuppressLint("InlinedApi")
    private fun createCameraSource(
        autoFocus: Boolean,
        useFlash: Boolean
    ) {
        val context: Context = requireActivity().applicationContext

        // A barcode detector is created to track barcodes.  An associated multi-processor instance
        // is set to receive the barcode detection results, track the barcodes, and maintain
        // graphics for each barcode on screen.  The factory is used by the multi-processor to
        // create a separate tracker instance for each barcode.
        val barcodeDetector = BarcodeDetector.Builder(context).build()
//        val barcodeFactory = BarcodeTrackerFactory(mGraphicOverlay, this)
//        barcodeDetector.setProcessor(MultiProcessor.Builder<Any>(barcodeFactory).build())

//        if (!barcodeDetector.isOperational) {
            // Note: The first time that an app using the barcode or face API is installed on a
            // device, GMS will download a native libraries to the device in order to do detection.
            // Usually this completes before the app is run for the first time.  But if that
            // download has not yet completed, then the above call will not detect any barcodes
            // and/or faces.
            //
            // isOperational() can be used to check if the required native libraries are currently
            // available.  The detectors will automatically become operational once the library
            // downloads complete on device.
            Log.e("LIST","Detector dependencies are not yet available.")

            // Check for low storage.  If there is low storage, the native library will not be
            // downloaded, so detection will not become operational.
//            val lowstorageFilter = IntentFilter(Intent.ACTION_DEVICE_STORAGE_LOW)
//            val hasLowStorage = registerReceiver(null, lowstorageFilter) != null
//            if (hasLowStorage) {
//                Toast.makeText(this, R.string.low_storage_error, Toast.LENGTH_LONG).show()
//                Log.w(
//                    com.google.android.gms.samples.vision.barcodereader.BarcodeCaptureActivity.TAG,
//                    getString(R.string.low_storage_error)
//                )
//            }
//        }

        // Creates and starts the camera.  Note that this uses a higher resolution in comparison
        // to other detection examples to enable the barcode detector to detect small barcodes
        // at long distances.
        var builder: CameraSource.Builder = CameraSource.Builder(requireActivity().applicationContext,
            barcodeDetector)
            .setFacing(CameraSource.CAMERA_FACING_BACK)
            .setRequestedPreviewSize(1600, 1024)
            .setRequestedFps(15.0f)

        // make sure that auto focus is an available option
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
//            builder = builder.setFocusMode(
//                if (autoFocus) Camera.Parameters.FOCUS_MODE_CONTINUOUS_PICTURE else null
//            )
//        }
        mCameraSource = builder
            // .setFlashMode(if (useFlash) Camera.Parameters.FLASH_MODE_TORCH else null)
            .build()
    }

    /**
     * Restarts the camera.
     */
    override fun onResume() {
        super.onResume()
        startCameraSource()
    }

    /**
     * Stops the camera.
     */
    override fun onPause() {
        super.onPause()
        binding!!.preview.stop()
    }

    /**
     * Releases the resources associated with the camera source, the associated detectors, and the
     * rest of the processing pipeline.
     */
    override fun onDestroy() {
        super.onDestroy()
        binding!!.preview.release()
    }

    /**
     * Starts or restarts the camera source, if it exists.  If the camera source doesn't exist yet
     * (e.g., because onResume was called before the camera source was created), this will be called
     * again when the camera source is created.
     */
    @Throws(SecurityException::class)
    private fun startCameraSource() {
        // check that the device has play services available.
        val code = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(
            requireActivity().application)

        if (code != ConnectionResult.SUCCESS) {
            val dlg = GoogleApiAvailability.getInstance().getErrorDialog(
                requireActivity(),
                code,
                RC_HANDLE_GMS
            )
            dlg.show()
        }
        if (mCameraSource != null) {
            try {
                // binding!!.preview.start(mCameraSource, binding!!.graphicOverlay)
                binding!!.preview.start(mCameraSource)
            } catch (e: IOException) {
                Log.e("LIST","Unable to start camera source.", e)
                mCameraSource?.release()
                mCameraSource = null
            }
        }
    }
}