package com.ostin.qrreader.util

import android.R
import android.content.Context
import android.graphics.*
import android.os.Build
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatImageView

/**
 * Author: Sergey Ostrovsky
 * Date: 22.05.20
 * Email: sergey.ostrovsky.it.dev@gmail.com
 */
class ReaderOverlay(context: Context?, attrs: AttributeSet?) : AppCompatImageView(context, attrs) {
    private var rect: RectF? = null
    private var isRectSet = false

    init {
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(View.LAYER_TYPE_SOFTWARE, null)
        }
    }

    private fun setup() {
        val rectWidth = this.width/1.3
        val radius = rectWidth/2

        val centerX = this.x + this.width/2
        val centerY = this.y + this.height/2

        val left = (centerX - radius).toFloat()
        val top = (centerY - radius).toFloat()
        val right = (centerX + radius).toFloat()
        val bottom = (centerY + radius).toFloat()

        this.rect = RectF(left, top, right, bottom)
        postInvalidate()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        if (!isRectSet) {
            setup()
            isRectSet = true
        }

        if (rect != null) {
            drawOverlay(canvas)
        }
    }

    private fun drawOverlay(canvas: Canvas) {
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.color = Color.argb(200, 0,0, 0)
        paint.style = Paint.Style.FILL
        canvas.drawPaint(paint)

        paint.xfermode = PorterDuffXfermode(PorterDuff.Mode.CLEAR)
        canvas.drawRect(rect!!, paint)

        drawLines(canvas)
    }

    private fun drawLines(canvas: Canvas) {
        val strokeWidth = 6f
        val halfStrokeWidth = strokeWidth/2

        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.color = getResources().getColor(R.color.white)
        paint.setStrokeWidth(strokeWidth);

        val padding = 0
        val lineWidth = rect!!.width()/3

        val line1_startX = (rect!!.left + padding)
        val line1_Y = (rect!!.top + padding)
        val line1_stopX = (line1_startX + lineWidth)

        val line2_X = line1_startX
        val line2_startY = (line1_Y - halfStrokeWidth)
        val line2_stopY = (line2_startY + lineWidth)

        val line3_startX = (rect!!.right - lineWidth - padding)
        val line3_Y = line1_Y
        val line3_stopX = (line3_startX + lineWidth)

        val line4_X = line3_stopX
        val line4_startY = line2_startY
        val line4_stopY = (line4_startY + lineWidth)

        val line5_X = line1_startX
        val line5_startY = (rect!!.bottom - lineWidth - padding)
        val line5_stopY = (line5_startY + lineWidth)

        val line6_startX = (line1_startX - halfStrokeWidth)
        val line6_Y = (rect!!.bottom - padding)
        val line6_stopX = (line6_startX + lineWidth)

        val line7_X = line3_stopX
        val line7_startY = line5_startY
        val line7_stopY = line5_stopY

        val line8_startX = line3_startX
        val line8_Y = line7_stopY
        val line8_stopX = (line3_stopX + halfStrokeWidth)

        val lines = floatArrayOf(
            line1_startX, line1_Y, line1_stopX, line1_Y,
            line2_X, line2_startY, line2_X, line2_stopY,
            line3_startX, line3_Y, line3_stopX, line3_Y,
            line4_X, line4_startY, line4_X, line4_stopY,
            line5_X, line5_startY, line5_X, line5_stopY,
            line6_startX, line6_Y, line6_stopX, line6_Y,
            line7_X, line7_startY, line7_X, line7_stopY,
            line8_startX, line8_Y, line8_stopX, line8_Y
        )
        canvas.drawLines(lines, paint)
    }
}