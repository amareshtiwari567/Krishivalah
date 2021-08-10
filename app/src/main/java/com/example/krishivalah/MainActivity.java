package com.example.krishivalah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

import com.example.krishivalah.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating an intent for different option.
        TextView yourField = (TextView) findViewById(R.id.yourField);
        //Setting onClickListener (on @created TextView variable) to create an intent.
        yourField.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


        //Creating an intent for different option.
        TextView weatherForecasting = (TextView) findViewById(R.id.weatherForecasting);
        //Setting onClickListener (on @created TextView variable) to create an intent.
        weatherForecasting.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Weather_Forecasting.class);
                startActivity(intent);
            }
        });

        //Creating an intent for different option.
        TextView detection = (TextView) findViewById(R.id.detection);
        //Setting onClickListener (on @created TextView variable) to create an intent.
        detection.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Image_processing.class);
                startActivity(intent);
            }
        });

        //Creating an intent for different option.
        TextView irrigation = (TextView) findViewById(R.id.irrigation);
        //Setting onClickListener (on @created TextView variable) to create an intent.
        irrigation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Irrigation_control.class);
                startActivity(intent);
            }
        });
    }
}