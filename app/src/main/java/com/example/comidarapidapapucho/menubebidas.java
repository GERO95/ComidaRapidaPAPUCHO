package com.example.comidarapidapapucho;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class menubebidas extends AppCompatActivity {


    private Spinner spinnerbebida1;
    private Spinner spinnerbebida2;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menubebidas);

        // esto es para poner los valores que saldran en los spiner para elegir la cantidad de productos
        spinnerbebida1 = (Spinner)findViewById(R.id.spinnerbebida1);
        String [] opcionesbebida = {"1","2","3"};
        ArrayAdapter<String> adapterbebida = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcionesbebida);
        spinnerbebida1.setAdapter(adapterbebida);

//ejem aqui el segundo spiner
        spinnerbebida2 = (Spinner)findViewById(R.id.spinnerbebida2);
        String [] opcionesbebida2 = {"1","2","3"};
        ArrayAdapter<String> adapterbebida2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcionesbebida2);
        spinnerbebida2.setAdapter(adapterbebida2);



    }
    public void Actcoca(View view){
        Intent Actcoca = new Intent(this, menucomida.class);
        startActivity(Actcoca);
    }

    public void Acthorchata(View view){
        Intent Acthorchata = new Intent(this, menucomida.class);
        startActivity(Acthorchata);
    }

    public void Actmenubebidasfinalizar(View view){
        Intent Actmenubebidasfinalizar = new Intent(this, menufinalizar.class);
        startActivity(Actmenubebidasfinalizar);
    }


}