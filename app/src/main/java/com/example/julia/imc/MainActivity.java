package com.example.julia.imc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText peso = (EditText) findViewById(R.id.texto1);
        final EditText altura = (EditText) findViewById(R.id.texto2);
        Button botao_imc = (Button) findViewById(R.id.botao);



        botao_imc.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {

                if (altura.getText().length() == 0 || peso.getText().length() == 0){
                    Toast.makeText(getApplicationContext(), "Campo vazio", Toast.LENGTH_SHORT).show();
                }
                else {

                    Double alt = Double.parseDouble(altura.getText().toString());
                    Double weight = Double.parseDouble(peso.getText().toString());
                    Double imc=0.0;

                    if (alt == 0){
                        Toast.makeText(getApplicationContext(), "Altura não pode ser nula", Toast.LENGTH_LONG).show();
                    }
                    else{
                        //imc = weight/(alt*alt);
                        Intent enviar = new Intent(MainActivity.this, Main2Activity.class);
                        enviar.putExtra("altura", alt);
                        enviar.putExtra("peso", weight);
                       // enviar.putExtra("imc", imc);
                        startActivity(enviar);
                    }


                }




            }
        });

    }
}
