package com.example.comidarapidapapucho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activitycono extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitycono);
    }

    public void ActRegreso(View view){
        Intent ActRegreso = new Intent(this, menucomida.class);
        startActivity(ActRegreso);
    }

    public void ActFinalizarcompra(View view){
        Intent ActFinalizarcompra = new Intent(this, VentaDetalleActivity.class);
        startActivity(ActFinalizarcompra);
    }



}