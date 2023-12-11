package com.example.petapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class activity_cargarMascotas extends AppCompatActivity implements View.OnClickListener {
    Button btnFechaNac ;
    EditText fechaNac ;
    Button btn_text_misMascotas;

    private int dia, mes, ano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cargar_mascotas);

        btnFechaNac=(Button) findViewById(R.id.btnFechaNac);
        fechaNac=(EditText) findViewById(R.id.fechaNac);
        btnFechaNac.setOnClickListener(this);
        fechaNac.setOnClickListener((this));

        btn_text_misMascotas=(Button)findViewById(R.id.btn_text_misMascotas);
        btn_text_misMascotas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent (activity_cargarMascotas.this, activityMisMascotas.class);
                startActivity(i);
            }
        });


    }

    @Override
    public void onClick(View v) {
        if (v==btnFechaNac){
            final Calendar c= Calendar.getInstance();
            dia=c.get(Calendar.DAY_OF_MONTH);
            mes=c.get(Calendar.MONTH);
            ano=c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    fechaNac.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                }
            }
            ,dia,mes,ano);
            datePickerDialog.show();
        }
    }
}