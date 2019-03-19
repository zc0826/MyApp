package com.example.myapp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar1);
        TextView t = (TextView) findViewById(R.id.login_text);
        setSupportActionBar(toolbar1);
        setTitle("登录");
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "忘记密码", Toast.LENGTH_SHORT).show();
            }
        });
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_login_back);

        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(GradientDrawable.RECTANGLE); // 画框
        drawable.setStroke(3, Color.RED); // 边框粗细及颜色
        drawable.setColor(0xdddddd); // 边框内部颜色

        Button b = findViewById(R.id.sign_up);
        b.setBackgroundDrawable(drawable); // 设置背景（效果就是有边框及底色）

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
        }
        return true;
    }
}
