package com.example.labwork1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static final String EXTRA_MESSAGE = "MainActivity.MESSAGE";
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = "welcome to 2nd screen!";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}