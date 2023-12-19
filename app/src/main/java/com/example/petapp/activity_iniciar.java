package com.example.petapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_iniciar extends AppCompatActivity {

    Button btn_text_registrarse;
    Button Ingresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar);

        btn_text_registrarse= findViewById(R.id.btn_text_registrarse);
        Ingresar= findViewById(R.id.Ingresar);

        btn_text_registrarse.setOnClickListener(view -> {

            Intent i = new Intent (activity_iniciar.this, Registrarse.class);
            startActivity(i);

        });

        Ingresar.setOnClickListener(view -> {

            Intent i = new Intent (activity_iniciar.this, activity_agregarMascota.class);
            startActivity(i);

        });

    }
}