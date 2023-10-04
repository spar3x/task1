package com.example.popov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnBoard1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board1);
    }
    public void onClick(View v){
        Intent intent = new Intent(this, OnBoard2.class);
        startActivity(intent);
    }
}