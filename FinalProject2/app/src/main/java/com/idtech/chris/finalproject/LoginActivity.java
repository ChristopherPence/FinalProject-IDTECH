package com.idtech.chris.finalproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
        EditText user = (EditText) findViewById(R.id.username);
        EditText pass = (EditText) findViewById(R.id.password);
        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        if(pass.getText().toString().equals(sharedPref.getString(user.getText().toString(), "")))
        {
            System.out.println("Test account logged in");
        }
        else
        {
            System.out.println("Log in failed");
        }
    }

    public void create(View view)
    {
        EditText user = (EditText) findViewById(R.id.usernameCreate);
        EditText pass = (EditText) findViewById(R.id.passwordCreate);
        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        String username = user.getText().toString();
        String password = pass.getText().toString();
        editor.putString(username, password);
        editor.commit();
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
