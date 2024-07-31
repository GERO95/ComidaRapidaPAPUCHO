package com.example.comidarapidapapucho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class menucomida extends AppCompatActivity {

    private TextView ETedittextmenu1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menucomida);


        ETedittextmenu1 = (TextView) findViewById(R.id.textviewmenu1);

        SharedPreferences usuariopreferences = getSharedPreferences("datosusuario", Context.MODE_PRIVATE);
        ETedittextmenu1.setText(usuariopreferences.getString("usuario",""));

        SharedPreferences preferencias = getSharedPreferences("datosusuario", Context.MODE_PRIVATE);
        SharedPreferences.Editor Obj_editor = preferencias.edit();
        Obj_editor.putString("usuario", ETedittextmenu1.getText().toString());
        Obj_editor.commit();
    }

    //Metodo para el boton buttonloguin1

    public void ActFinalizar(View view){
        Intent ActFinalizar = new Intent(this, VentaDetalleActivity.class);
        startActivity(ActFinalizar);
    }

    public void Actlitro(View view){
        Intent Actlitro = new Intent(this, Activitylitro.class);
        startActivity(Actlitro);
    }

    public void Actcono(View view){
        Intent Actcono = new Intent(this, Activitycono.class);
        startActivity(Actcono);
    }

    public void Actpaleta(View view){
        Intent Actpaleta = new Intent(this, Activitypaleta.class);
        startActivity(Actpaleta);
    }
    public void Actvaso(View view){
        Intent Actvaso = new Intent(this, Activityvaso.class);
        startActivity(Actvaso);
    }

}