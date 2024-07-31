package com.example.comidarapidapapucho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityUsuarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);
    }

    public void ActRegresoUS(View view){
        Intent ActRegresoUS = new Intent(this, menucomida.class);
        startActivity(ActRegresoUS);
    }



}