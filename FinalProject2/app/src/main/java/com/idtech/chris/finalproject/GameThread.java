package com.idtech.chris.finalproject;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.SurfaceHolder;

/**
 * Created by student on 7/26/2016.
 */
public class GameThread extends Thread
{
    private SurfaceHolder surfaceHolder;
    private OneLevel oneLevel;

    private boolean running;
    public void setRunning(boolean running)
    {
        this.running = running;
    }

    public GameThread(SurfaceHolder surfaceHolder, OneLevel oneLevel)
    {
        super();
        this.surfaceHolder = surfaceHolder;
        this.oneLevel = oneLevel;
    }

    @Override
    @SuppressLint("WrongCall")
    public void run()
    {
        Canvas canvas;
        while(running)
        {
            canvas = null;
            try
            {
                canvas = this.surfaceHolder.lockCanvas();
                synchronized(surfaceHolder)
                {
                    this.oneLevel.onDraw(canvas);
                }
            }

            finally
            {
                if (canvas != null)
                {
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
        }
    }
}
