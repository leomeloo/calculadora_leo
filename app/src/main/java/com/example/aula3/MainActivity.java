package com.example.aula3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText valorA,valorB,resultado;
    Button btSomar, btSubtrair, btDividir, btMultiplicar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linkando as variaveis com a activity Text
        valorA = findViewById(R.id.vA);
        valorB = findViewById(R.id.vB);

        //Linkando as variaveis com a activity Button
        btSomar = findViewById(R.id.btSomar);
        btDividir = findViewById(R.id.btDividir);
        btMultiplicar = findViewById(R.id.btMultiplicar);
        btSubtrair = findViewById(R.id.btSubtrair);

                //Acionando o botao Somar
        btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double vA, vB, vR;


                vA = Double.parseDouble(valorA.getText().toString());
                vB = Double.parseDouble(valorB.getText().toString());

                vR = vA + vB;

                Intent it = new Intent(MainActivity.this, ResultActivity.class);
                it.putExtra("vR2", vR);
                startActivity(it);
            }
        });

        //Acionando o botao Subtrair
        btSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double vA, vB, vR;

                vA = Double.parseDouble(valorA.getText().toString());
                vB = Double.parseDouble(valorB.getText().toString());

                vR = vA - vB;

                Intent it = new Intent(MainActivity.this, ResultActivity.class);
                it.putExtra("vR2", vR);
                startActivity(it);
            }
        });

        //Acionando o botao Multiplicar
        btMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double vA, vB, vR;

                vA = Double.parseDouble(valorA.getText().toString());
                vB = Double.parseDouble(valorB.getText().toString());

                vR = vA * vB;

                Intent it = new Intent(MainActivity.this, ResultActivity.class);
                it.putExtra("vR2", vR);
                startActivity(it);
            }
        });

        //Acionando o botao Dividir
        btDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double vA, vB, vR;

                vA = Double.parseDouble(valorA.getText().toString());
                vB = Double.parseDouble(valorB.getText().toString());

                vR = vA / vB;

                Intent it = new Intent(MainActivity.this, ResultActivity.class);
                it.putExtra("vR2", vR);
                startActivity(it);
            }

        });
    }
}