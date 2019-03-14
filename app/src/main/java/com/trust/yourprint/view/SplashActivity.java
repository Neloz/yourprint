package com.trust.yourprint.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.trust.yourprint.MainActivity;
import com.trust.yourprint.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //Declaramos un Handler que hace de unión entre el hilo principal y el secundario
        Handler handler = new Handler();

        //Llamamos al método postDelayed
        handler.postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, 2000); // 2 segundos de "delay"
    }
}
