package com.idtech.chris.finalproject;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by student on 7/26/2016.
 */
public class OneLevel extends SurfaceView implements SurfaceHolder.Callback
{
    public OneLevel(Context context)
    {
        super(context);
        getHolder().addCallback(this);
        setFocusable(true);
    }
}
