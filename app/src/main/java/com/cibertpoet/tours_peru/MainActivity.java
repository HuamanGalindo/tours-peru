package com.cibertpoet.tours_peru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cibertpoet.tours_peru.departamento.ayacucho;
import com.cibertpoet.tours_peru.departamento.amazonas;
import com.cibertpoet.tours_peru.departamento.arequipa;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  btnCusco(View view){
        Intent click= new Intent(this, cusco.class);
        startActivity(click);
    }

    public void  btnAyacucho(View view){
        Intent click= new Intent(this, ayacucho.class);
        startActivity(click);
    }

    public void btnAmazonas (View view){
        Intent click= new Intent(this, amazonas.class );
        startActivity(click);
    }
    public void  btnArequipa(View view){
        Intent click= new Intent(this, arequipa.class);
        startActivity(click);
    }

}

