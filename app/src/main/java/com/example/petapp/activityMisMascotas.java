package com.example.petapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activityMisMascotas extends AppCompatActivity {

    Button btn_text_agregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_mascotas);

        btn_text_agregar=(Button)findViewById(R.id.btn_text_agregar);
        btn_text_agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent (activityMisMascotas.this, activity_cargarMascotas.class);
                startActivity(i);
            }
        });
    }
}