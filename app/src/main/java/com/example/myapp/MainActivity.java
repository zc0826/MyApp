package com.example.myapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    Timer timer = new Timer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //隐藏顶部图标
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final Intent intent = new Intent(this, FirstActivity.class);
        ImageView imageView = (ImageView) findViewById(R.id.image_main);
        imageView.setOnClickListener(this);

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                startActivity(intent);
            }
        };
        timer.schedule(timerTask, 5 * 100);
    }

    @Override
    public void onClick(View v) {
        Intent intent1 = new Intent(this, Advertisement.class);
        startActivity(intent1);
        timer.cancel();
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}
