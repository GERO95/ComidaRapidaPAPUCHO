package com.example.comidarapidapapucho;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class menupizza extends AppCompatActivity {

    private Spinner spinnerpizza1;
    private Spinner spinnerpizza2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menupizza);


        // esto es para poner los valores que saldran en los spiner para elegir la cantidad de productos
        spinnerpizza1 = (Spinner)findViewById(R.id.spinnerpizza1);
        String [] opcionespizza = {"1","2","3"};
        ArrayAdapter<String> adapterpizza = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcionespizza);
        spinnerpizza1.setAdapter(adapterpizza);

//ejem aqui el segundo spiner
        spinnerpizza2 = (Spinner)findViewById(R.id.spinnerpizza2);
        String [] opcionespizza2 = {"1","2","3"};
        ArrayAdapter<String> adapterpizza2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcionespizza2);
        spinnerpizza2.setAdapter(adapterpizza2);


    }
    public void Actpastor(View view){
        Intent Actpastor = new Intent(this, menucomida.class);
        startActivity(Actpastor);
    }
    public void Actpeperoni(View view){
        Intent Actpeperoni = new Intent(this, menucomida.class);
        startActivity(Actpeperoni);
    }
    public void Actmenupizzafinalizar(View view){
        Intent Actmenupizzafinalizar = new Intent(this, menufinalizar.class);
        startActivity(Actmenupizzafinalizar);
    }


}