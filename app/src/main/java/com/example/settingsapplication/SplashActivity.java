package com.example.settingsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SplashActivity extends AppCompatActivity {
    ImageView mGif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashTimer();
        initViews();
        mGif=findViewById(R.id.imag_view);
    }

    private void splashTimer() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                    startActivity(new Intent(SplashActivity.this,MainActivity.class));


            }
        },8000);

    }

    private void initViews() {
        mGif=findViewById(R.id.imag_view);
        Glide.with(SplashActivity.this).load(R.raw.giphy).into(mGif);
    }
}
