package com.idtech.chris.finalproject;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by student on 7/27/2016.
 */

public class IntroLevel extends Activity
{
    private int side = 200;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introlevel_main);
        getActionBar().hide();

        //SPAWN IN ROCK
        ImageView item1 = (ImageView) findViewById(R.id.item1);
        item1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                switch (event.getActionMasked()) {
                    case MotionEvent.ACTION_UP:
                        view.setVisibility(View.INVISIBLE);
                        GridLayout layout = (GridLayout) findViewById(R.id.screen);
                        ImageView imageView = new ImageView(getApplicationContext());
                        imageView.setImageBitmap(BitmapFactory.decodeResource(
                                getResources(), R.drawable.cheese));
                        imageView.setId(R.id.rock1);
                        layout.addView(imageView);
                        imageView.getLayoutParams().height = side;
                        imageView.getLayoutParams().width = side;
                        Move move = new Move(imageView);

                        break;
                }
                return true;
            }
        });

        ImageView item2 = (ImageView) findViewById(R.id.item2);
        item2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                switch (event.getActionMasked()) {
                    case MotionEvent.ACTION_UP:
                        view.setVisibility(View.INVISIBLE);
                        GridLayout layout = (GridLayout) findViewById(R.id.screen);
                        ImageView imageView = new ImageView(getApplicationContext());
                        imageView.setImageBitmap(BitmapFactory.decodeResource(
                                getResources(), R.drawable.ball));
                        layout.addView(imageView);
                        imageView.getLayoutParams().height = side;
                        imageView.getLayoutParams().width = side;
                        Move move = new Move(imageView);
                        break;
                }
                return true;
            }
        });

    }

    public void reset(View view)
    {
        finish();
        startActivity(getIntent());
    }

    public void start(View view)
    {
        ImageView mouse = (ImageView) findViewById(R.id.mouse);
        ImageView cheese = (ImageView) findViewById(R.id.rock1);

        float mouseX, mouseY, cheeseX, cheeseY, difX, difY, moveX, moveY;
        int distance;
        boolean noCollision = true;
        mouseX = mouse.getX();
        mouseY = mouse.getY();
        cheeseX = cheese.getX();
        cheeseY = cheese.getY();

        Rect rcm = new Rect();
        mouse.getDrawingRect(rcm);
        Rect rcc = new Rect();
        cheese.getDrawingRect(rcc);
        Rect rcb = new Rect();


        mouse.animate().x(cheeseX).y(cheeseY).setDuration(1000).start();
        if(Rect.intersects(rcm, rcc))
        {
            noCollision = false;
            System.out.println("There was a collision");
        }
    }

    public void help(View view)
    {


    }
}
