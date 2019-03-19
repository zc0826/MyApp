package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Advertisement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advertisement);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}
