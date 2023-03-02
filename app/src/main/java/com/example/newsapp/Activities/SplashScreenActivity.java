package com.example.newsapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.newsapp.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

        new Thread(){
            public void run(){
                try {
                    sleep(2*1000);
                    startActivity(new Intent(SplashScreenActivity.this,MainActivity.class));
                    finishAffinity();
                }catch (Exception e)
                {
                    Toast.makeText(SplashScreenActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        }.start();
    }
}