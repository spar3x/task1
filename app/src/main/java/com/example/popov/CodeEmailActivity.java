package com.example.popov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

public class CodeEmailActivity extends AppCompatActivity {
    private EditText first1;
    private EditText first2;
    private EditText first3;
    private EditText first4;

    private String first;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_email);
        first1 = findViewById(R.id.first);
        first2 = findViewById(R.id.second);
        first3 = findViewById(R.id.third);
        first4 = findViewById(R.id.fours);
        first = "";
        first = first1.getText().toString();
        int count = 0;


        for( int i = 0; i==3; i++ ) {
            count +=1;
            first = first.substring(0,4);
            first = (EditText)(first + (String.valueOf(count)));

            first.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if (s.length() == 1) {
                        first2.requestFocus();
                    }


                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });
        }


    }
    public void onClickBack(View v){
        Intent intent = new Intent(this, EmailActivity.class);
        startActivity(intent);
    }
}