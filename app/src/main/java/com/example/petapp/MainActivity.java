package com.example.petapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn_text_iniciosesion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_text_iniciosesion= findViewById(R.id.btn_text_iniciosesion);

        btn_text_iniciosesion.setOnClickListener(view -> {

            Intent i = new Intent (MainActivity.this, activity_iniciar.class);
            startActivity(i);

        });

    }
}