package com.idtech.chris.finalproject;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by student on 7/27/2016.
 */
public class IntroLevel extends Activity
{
    private int rockSupply = 2;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introlevel_main);
        getActionBar().hide();

        //SPAWN IN ROCK
        ImageView item1 = (ImageView) findViewById(R.id.item1);
        item1.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View view, MotionEvent event)
            {
                switch (event.getActionMasked())
                {
                    case MotionEvent.ACTION_UP:
                        if(rockSupply != 0)
                        {
                            RelativeLayout layout = (RelativeLayout) findViewById(R.id.screen);
                            if(rockSupply != 0)
                            {
                                ImageView imageView = new ImageView(getApplicationContext());
                                imageView.setImageBitmap(BitmapFactory.decodeResource(
                                        getResources(), R.drawable.rock));
                                layout.addView(imageView);
                                Move move = new Move(imageView);
                            }



                            rockSupply--;
                            System.out.println("THIS IS THE ROCK SUPPLY " + rockSupply);
                        }

                        break;
                }



                return true;
            }
        });

    }
}
