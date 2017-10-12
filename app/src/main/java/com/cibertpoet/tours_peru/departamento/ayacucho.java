package com.cibertpoet.tours_peru.departamento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cibertpoet.tours_peru.R;
import com.cibertpoet.tours_peru.reserva_vuelo;

public class ayacucho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayacucho);
    }

    public void reserva_vuelo(View view){
        Intent click = new Intent(this, reserva_vuelo.class);
        startActivity(click);
    }


}
