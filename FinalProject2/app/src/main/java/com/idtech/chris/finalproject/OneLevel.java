package com.idtech.chris.finalproject;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

/**
 * Created by student on 7/26/2016.
 */
public class OneLevel extends SurfaceView implements SurfaceHolder.Callback
{
    private GameThread thread;
    private Rock rock;

    public OneLevel(Context context)
    {
        super(context);
        getHolder().addCallback(this);

        thread = new GameThread(getHolder(), this);
        setFocusable(true);

        rock = new Rock(BitmapFactory.decodeResource(getResources(), R.drawable.rock), 50, 50);

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height)
    {

    }
    @Override
    public void surfaceCreated(SurfaceHolder holder)
    {
        thread.setRunning(true);
        thread.start();
    }
    @Override
    public void surfaceDestroyed(SurfaceHolder holder)
    {
        boolean retry = true;
        while(retry)
        {
            try
            {
                thread.join();
                retry = false;
            }
            catch(InterruptedException e)
            {

            }
        }
    }
    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        return true;
    }
    @Override
    protected void onDraw(Canvas canvas)
    {
        canvas.drawColor(Color.BLACK);
        rock.draw(canvas);
    }
}
