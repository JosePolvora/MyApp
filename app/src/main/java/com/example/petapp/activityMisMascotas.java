package com.example.petapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activityMisMascotas extends AppCompatActivity {

    Button btn_text_agregar;
    Button verMascota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_mascotas);

        btn_text_agregar = findViewById(R.id.btn_text_agregar);

        verMascota = findViewById(R.id.verMascota);

        btn_text_agregar.setOnClickListener(view -> {

            Intent i = new Intent(activityMisMascotas.this, activity_cargarMascotas.class);
            startActivity(i);
        });

        verMascota.setOnClickListener(view -> {

            Intent i = new Intent(activityMisMascotas.this, activityMisMascotas001.class);
            startActivity(i);
        });

    }
}