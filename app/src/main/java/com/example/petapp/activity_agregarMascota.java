package com.example.petapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_agregarMascota extends AppCompatActivity {

    Button btn_text_agregar;
    Button btn_text_misMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_mascota);

        btn_text_agregar= findViewById(R.id.btn_text_agregar);
        btn_text_misMascotas= findViewById(R.id.btn_text_misMascotas);

        btn_text_agregar.setOnClickListener(view -> {

            Intent i = new Intent (activity_agregarMascota.this, activity_cargarMascotas.class);
            startActivity(i);
        });

        btn_text_misMascotas.setOnClickListener(view -> {

            Intent i = new Intent (activity_agregarMascota.this, activityMisMascotas.class);
            startActivity(i);
        });
    }
}