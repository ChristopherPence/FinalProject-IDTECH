package com.idtech.chris.finalproject;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by student on 7/27/2016.
 */
public class Move
{
    private float xCoOrdinate;
    private float yCoOrdinate;

    public Move(ImageView imageView)
    {
        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                switch (event.getActionMasked()) {
                    case MotionEvent.ACTION_DOWN:
                        xCoOrdinate = view.getX() - event.getRawX();
                        yCoOrdinate = view.getY() - event.getRawY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        view.animate().x(event.getRawX() + xCoOrdinate).y(event.getRawY() + yCoOrdinate).setDuration(0).start();
                        break;
                    default:
                        return false;
                }
                return true;
            }
        });
    }
}
