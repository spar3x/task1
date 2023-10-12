package com.example.popov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

public class EmailActivity extends AppCompatActivity {
    private AppCompatButton login;
    private EditText email;

    private String emailText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        login = findViewById(R.id.loginNext);

        email = findViewById(R.id.loginEmail);

        login.setEnabled(false);
        emailText = "";
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                emailText = email.getText().toString();
                validateMail(emailText);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    private void validateMail(String email){
        if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            login.setEnabled(true);
            login.setBackgroundColor(getColor(R.color.blue));

        } else {
            login.setEnabled(false);
            login.setBackgroundColor(getColor(R.color.lightblue));
        }
    }
    public void onClick(View v){
        Intent intent = new Intent(this, CodeEmailActivity.class);
        startActivity(intent);
    }
}