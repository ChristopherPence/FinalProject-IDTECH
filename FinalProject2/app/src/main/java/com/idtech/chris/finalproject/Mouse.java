package com.idtech.chris.finalproject;

import android.text.Layout;
import android.widget.ImageView;

/**
 * Created by student on 7/27/2016.
 */

public class Mouse
{
    private float mx;
    private float my;
    private float distance;

    public void mouseMove(ImageView imageView, int x, int y)
    {
        if(mx == x)
        {
            Math.abs(distance = my - y);
            distance /= 10;
            if(x < mx)
            {
                imageView.setX(mx - distance);
            }
            else
            {
                imageView.setX(mx + distance);
            }
        }
        if(my == y)
        {
            Math.abs(distance = mx - x);
            distance /= 10;
            if(y < my)
            {
                imageView.setY(my - distance);
            }
            else
            {
                imageView.setY(my - distance);
            }
        }

    }
}
