package com.idtech.chris.finalproject;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by student on 7/26/2016.
 */
public class GameActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(new OneLevel(this));
        getActionBar().hide();
    }
}
