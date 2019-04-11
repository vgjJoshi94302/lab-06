# lab-06

Lab 6

So the next few labs will be designed to aid in your Assignment 3. These labs are a lot easier than what I have assigned in the past. You have Prof. Filion to thank.



         1.  Create a new app

 

         2.Take a photo and display it on the background

 

         3.Click and drag my finger, it draws a smooth (Bezier spline) curve between movements.



Due August 12. There will be no extensions





Supporting Code

package com.example.jfilion.assignment2;

/**
* Created by jfilion on 12/3/2015.
*/


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;


public class DrawImageView extends ImageView {
private Paint currentPaint;
public boolean drawRect = true;
public float left;
public float top;
public float right;
public float bottom;

public DrawImageView(Context context, AttributeSet attrs) {
super(context, attrs);

currentPaint = new Paint();
currentPaint.setDither(true);
currentPaint.setColor(0xFF00CC00); // alpha.r.g.b
currentPaint.setStyle(Paint.Style.STROKE);
currentPaint.setStrokeJoin(Paint.Join.ROUND);
currentPaint.setStrokeCap(Paint.Cap.ROUND);
currentPaint.setStrokeWidth(2);
}

@Override
protected void onDraw(Canvas canvas) {
super.onDraw(canvas);
if (drawRect)
{
canvas.drawRect(0, 0, 300, 300, currentPaint);
}
}
}

Android Finger painting Tutorial

http://code.tutsplus.com/tutorials/android-sdk-create-a-drawing-app-touch-interaction--mobile-19202
