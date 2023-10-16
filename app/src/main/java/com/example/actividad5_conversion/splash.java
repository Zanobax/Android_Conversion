package com.example.actividad5_conversion;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        TextView cuenta=findViewById(R.id.cuenta);

        new CountDownTimer(5000, 1000) {

            public void onTick(long restante) {
                int tiempo= (int) restante / 1000;
                cuenta.setText(String.valueOf(tiempo));
            }
            public void onFinish() {
                startActivity(new Intent(splash.this,MainActivity.class));
            }
        }.start();


    }



}
