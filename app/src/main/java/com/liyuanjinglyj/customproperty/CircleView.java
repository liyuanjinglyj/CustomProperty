package com.liyuanjinglyj.customproperty;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CircleView extends View {
    private int radius;
    private int circleX,circleY;
    private Paint paint;
    public CircleView(Context context) {
        super(context);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray=context.obtainStyledAttributes(attrs,R.styleable.CircleView);//获取自定义属性
        this.radius=typedArray.getInt(R.styleable.CircleView_radius,50);
        this.circleX=typedArray.getInt(R.styleable.CircleView_CircleX,25);
        this.circleY=typedArray.getInt(R.styleable.CircleView_CircleY,25);
        typedArray.recycle();
        this.paint=new Paint();
        this.paint.setColor(Color.RED);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setStrokeWidth(6);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.circleX,this.circleY,this.radius,this.paint);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
