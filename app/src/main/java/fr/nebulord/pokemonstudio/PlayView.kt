package fr.nebulord.pokemonstudio

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Build
import android.support.annotation.RequiresApi
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener

class PlayView : View, OnTouchListener {

    private var mPaint = Paint()
    companion object {
        val DELTA = 8
    }

    lateinit var thunder: ThunderBall
    constructor(context: Context) : super(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        thunder.move()
        canvas?.drawCircle(thunder.cx, thunder.cy, thunder.rad, mPaint)
        invalidate()
    }

    private fun init() {
        super.setOnTouchListener(this)
        mPaint.color = Color.YELLOW
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        thunder = ThunderBall(width.toFloat(), height.toFloat())
        thunder.delta = DELTA
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        if(event != null) {
            thunder.cx = event.x
            thunder.cy = event.y
            return true
        }
        return false
    }
}