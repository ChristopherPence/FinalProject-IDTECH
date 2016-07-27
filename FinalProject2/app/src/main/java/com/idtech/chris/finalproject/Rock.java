package com.idtech.chris.finalproject;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by student on 7/26/2016.
 */
public class Rock
{
    private Bitmap bitmap;
    private int x, y, xVelocity;

    public Rock(Bitmap bitmap, int x, int y)
    {
        this.bitmap = bitmap;
        this.x = x;
        this.y = y;
    }

    public void draw(Canvas canvas)
    {
        canvas.drawBitmap(bitmap, x, y, null);
        x = x + xVelocity;
    }

    public void setXVelocity(int xVelocity)
    {
        this.xVelocity = xVelocity;
    }
}
