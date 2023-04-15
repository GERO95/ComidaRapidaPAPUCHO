package com.example.comidarapidapapucho;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class menuhamburguesa extends AppCompatActivity {


    private Spinner spinnerhamburguesa1;
    private Spinner spinnerhamburguesa2;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuhamburguesa);


        // esto es para poner los valores que saldran en los spiner para elegir la cantidad de productos
        spinnerhamburguesa1 = (Spinner)findViewById(R.id.spinnerhamburguesa1);
        String [] opcioneshamburguesa = {"1","2","3"};
        ArrayAdapter<String> adapterhamburguesa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcioneshamburguesa);
        spinnerhamburguesa1.setAdapter(adapterhamburguesa);

//ejem aqui el segundo spiner
        spinnerhamburguesa2 = (Spinner)findViewById(R.id.spinnerhamburguesa2);
        String [] opcioneshamburguesa2 = {"1","2","3"};
        ArrayAdapter<String> adapterhamburguesa2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcioneshamburguesa2);
        spinnerhamburguesa2.setAdapter(adapterhamburguesa2);


    }

    public void Actnormal(View view){
        Intent Actnormal = new Intent(this, menucomida.class);
        startActivity(Actnormal);
    }

    public void Actdeluxe(View view){
        Intent Actdeluxe = new Intent(this, menucomida.class);
        startActivity(Actdeluxe);
    }

    public void Actmenuhamburguesafinalizar(View view){
        Intent Actmenuhamburguesafinalizar = new Intent(this, menufinalizar.class);
        startActivity(Actmenuhamburguesafinalizar);
    }


}