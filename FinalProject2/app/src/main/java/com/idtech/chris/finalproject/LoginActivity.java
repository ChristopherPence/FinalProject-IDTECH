package com.idtech.chris.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by student on 7/28/2016.
 */
public class LoginActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);
        getActionBar().hide();

        Intent intent = getIntent();
    }

    public void login(View view)
    {

    }

    public void create(View view)
    {
        EditText user = (EditText) findViewById(R.id.usernameCreate);
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        count = 0;
//
//        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
//
//        int savedCount = sharedPref.getInt("Saved Count", 0);
//        count = savedCount;
//
//        TextView textView = (TextView)findViewById(R.id.textView);
//        textView.setText("" + count);
//    }

}
