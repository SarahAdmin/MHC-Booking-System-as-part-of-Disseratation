package com.example.maldenhollywoodcinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void myMHCprofile (View view) {
        Intent profileIn = new Intent (this, AccountDetails.class);
        startActivity(profileIn);
    }
    public void orderHistory (View view) {
        Intent orderOne = new Intent (this, OrderDetails.class);
        startActivity(orderOne);
    }
    public void variousFilms (View view) {
        Intent anyFilms = new Intent (this, Films.class);
        startActivity(anyFilms);
    }
    public void signedOutHome (View view) {
        Intent SOIntent = new Intent (this, MainActivity.class);
        startActivity(SOIntent);
    }
}
