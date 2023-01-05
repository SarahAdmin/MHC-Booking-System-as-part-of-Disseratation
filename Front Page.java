package com.example.maldenhollywoodcinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartNow(View view){
        Intent intentOne = new Intent(this, Menu.class);
        startActivity(intentOne);
    }

    public void signInLink (View view) {
        Intent intentTwo = new Intent(this, LogIn.class);
        startActivity(intentTwo);
    }
}
