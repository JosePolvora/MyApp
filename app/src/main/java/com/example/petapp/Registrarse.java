package com.example.petapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Registrarse extends AppCompatActivity implements View.OnClickListener {

    EditText etnombre, etapellido, etemail, etcontrasena;
    Button btn_text_agregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        etnombre = findViewById(R.id.editTextNombre);
        etapellido = findViewById(R.id.editTextApellido);
        etemail = findViewById(R.id.editTextTextEmailAddress);
        etcontrasena = findViewById(R.id.editTextTextPassword);
        btn_text_agregar= findViewById(R.id.btn_text_agregar);

        btn_text_agregar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        final String nombre=etnombre.getText().toString();
        final String apellido=etapellido.getText().toString();
        final String email=etemail.getText().toString();
        final String contrasena=etcontrasena.getText().toString();

        Response.Listener<String> respoListener = response -> {
            try {
                JSONObject jsonReponse = new JSONObject(response);
                boolean success = jsonReponse.getBoolean("success");

                if (success) {
                    Intent intent = new Intent(Registrarse.this, activity_iniciar.class);
                    Registrarse.this.startActivity(intent);
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Registrarse.this);
                    builder.setMessage("error de registro")
                            .setNegativeButton("Retry", null)
                            .create().show();
                }


            } catch (JSONException e) {
                throw new RuntimeException(e);
                /*e.printStackTrace();*/
            }
        };

    RegisterRequest registerRequest = new RegisterRequest(nombre, apellido, email, contrasena, respoListener);
        RequestQueue queue = Volley.newRequestQueue(Registrarse.this);
        queue.add(registerRequest);
    }
}