package com.example.passingresult;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView txt = findViewById(R.id.textView);
        String username = getIntent().getStringExtra("enteredData");
        txt.setText(username);

    }
}