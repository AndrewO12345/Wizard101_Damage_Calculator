package com.example.myapplication;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Button home = findViewById(R.id.home);

        Intent intent = new Intent(this, MainActivity.class);

        home.setOnClickListener((v -> startActivity(intent)));
    }
}