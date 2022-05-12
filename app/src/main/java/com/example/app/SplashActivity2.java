package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        getSupportActionBar().hide();

        Thread thread = new Thread() {

            public void run() {

                try {
                    sleep(3000);


                } catch (Exception e) {

                    e.printStackTrace();

                } finally {

                    Intent intent = new Intent(SplashActivity2.this, SplashActivity.class);
                    startActivity(intent);
                }

            }


        };
        thread.start();


    }
}