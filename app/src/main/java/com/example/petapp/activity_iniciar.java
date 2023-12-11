package com.example.petapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_iniciar extends AppCompatActivity {

    Button btn_text_registrarse;
    Button Ingresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar);

        btn_text_registrarse=(Button)findViewById(R.id.btn_text_registrarse);
        Ingresar=(Button)findViewById(R.id.Ingresar);

        btn_text_registrarse.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent (activity_iniciar.this, Registrarse.class);
                startActivity(i);

            }
        });

        Ingresar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent (activity_iniciar.this, activity_agregarMascota.class);
                startActivity(i);

            }
        });

    }
}