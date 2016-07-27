package com.idtech.chris.finalproject;

/*
    Chris Pence
    7/25/16
 */

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_main);
        getActionBar().hide();
    }

    public void enterGame(View view)
    {
        Intent intent = new Intent(this, LevelSelect.class);
        startActivity(intent);
    }
}
