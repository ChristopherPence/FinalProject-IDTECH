package com.idtech.chris.finalproject;

/*
    Chris Pence
    7/25/16
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class LevelSelect extends Activity
{
    private int status;
    private float xCoOrdinate, yCoOrdinate;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levelselect_main);
        getActionBar().hide();

        Intent intent = getIntent();

    }

    public void level1(View view)
    {
        Intent intent = new Intent(this, IntroLevel.class);
        startActivity(intent);
    }

    public void loginButton(View view)
    {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }



}
