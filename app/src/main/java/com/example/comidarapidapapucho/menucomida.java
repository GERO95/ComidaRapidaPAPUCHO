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
        Intent ActFinalizar = new Intent(this, menufinalizar.class);
        startActivity(ActFinalizar);
    }

    public void ActBebidas(View view){
        Intent ActBebidas = new Intent(this, menubebidas.class);
        startActivity(ActBebidas);
    }

    public void ActHamburguesa(View view){
        Intent ActHamburguesa = new Intent(this, menuhamburguesa.class);
        startActivity(ActHamburguesa);
    }

    public void ActPizza(View view){
        Intent ActPizza = new Intent(this, menupizza.class);
        startActivity(ActPizza);
    }


}