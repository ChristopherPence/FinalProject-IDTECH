package com.idtech.chris.finalproject;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by student on 7/27/2016.
 */
public class Select
{
    public Select(ImageView item)
    {
        item.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getActionMasked())
                {
                    case MotionEvent.ACTION_DOWN:
                        v.setPadding(1, 1, 1, 1);
                        v.setBackgroundColor(Color.RED);
                        break;

                    case MotionEvent.ACTION_UP:
                        v.setPadding(0, 0, 0, 0);
                }

                return true;
            }
        });
    }
}
