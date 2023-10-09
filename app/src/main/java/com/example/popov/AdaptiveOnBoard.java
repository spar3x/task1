package com.example.popov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdaptiveOnBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaptive_on_board);
    }
    public void onClick1(View v){
        Intent intent = new Intent(this, OnBoard2.class);
        startActivity(intent);
    }
    public void onClick(View v){
        Intent intent = new Intent(this, EmailActivity.class);
        startActivity(intent);
    }
}