package com.example.G18_design.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class DesignView extends View {

    private final Paint brush;

    public DesignView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        brush = new Paint();
        brush.setColor(Color.BLACK);
        brush.setStrokeWidth(5);
        brush.setStyle(Paint.Style.STROKE);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
