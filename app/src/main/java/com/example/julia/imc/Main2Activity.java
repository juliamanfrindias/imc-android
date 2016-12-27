package com.example.julia.imc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Double imc_calc;
        Double alt = intent.getDoubleExtra("altura",0);
        Double pes = intent.getDoubleExtra("peso",0);
        //Double imc_calc = intent.getDoubleExtra("imc",0);

        alt = alt/100;
        imc_calc = pes/(alt*alt);

        TextView text = (TextView) findViewById(R.id.resultado);
        text.setText("Resultado: " + imc_calc);

    }
}
