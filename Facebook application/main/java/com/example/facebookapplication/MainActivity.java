package com.example.facebookapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  Chats(View view)
    {
        Intent i=new Intent(this,Friends.class);
        startActivity(i);
    }
    public void  settings(View view)
    {
        Intent i=new Intent(this,Friends.class);
        startActivity(i);
    }
    public void  Friends(View view)
    {
        Intent i=new Intent(this, Friends.class);
        startActivity(i);
    }
    public void  Notification(View view)
    {
        Intent i=new Intent(this, Friends.class);
        startActivity(i);
    }
}