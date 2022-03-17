package com.example.tp2_splashscreen_loginstatic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class Splash_Activity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
// This method will be executed once the timer is over
// Start your app main activity
                Intent i = new Intent(Splash_Activity.this, LoginActivity.class);
                startActivity(i);
// close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }




}