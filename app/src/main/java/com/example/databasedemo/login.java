package com.example.databasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.newRegisterBtn).setOnClickListener(view -> {
            Intent I = new Intent(this, RegisterActivity.class);
            startActivity(I);
            finish();
        });
    }
}