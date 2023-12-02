package com.example.petapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registrarse extends AppCompatActivity {

    Button btn_text_comenzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);




        btn_text_comenzar=(Button)findViewById(R.id.btn_text_agregar);

        btn_text_comenzar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent (Registrarse.this, activity_iniciar.class);
                startActivity(i);

            }
        });



    }
}