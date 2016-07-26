package com.idtech.chris.finalproject;

/*
    Chris Pence
    7/25/16
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LevelSelect extends Activity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levelselect_main);

        Intent intent = getIntent();
    }

    public void level1(View view)
    {
        Intent intent = new Intent(this, LevelOne.class);
        startActivity(intent);
    }



}
