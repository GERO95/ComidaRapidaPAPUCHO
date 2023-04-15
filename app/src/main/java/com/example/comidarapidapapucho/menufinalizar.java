package com.example.comidarapidapapucho;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menufinalizar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menufinalizar);
    }
    public void Actmenufinalizar(View view){
     //   Intent Actmenufinalizar = new Intent(this, menufinalizar.class);
        finishAffinity ();
      //  startActivity(Actmenufinalizar);

    }

}