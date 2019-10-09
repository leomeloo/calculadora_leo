package com.example.aula3;

import androidx.appcompat.app.AppCompatActivity;

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
        resultado = findViewById(R.id.mostrarResultado);

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

                resultado.setText(String.valueOf(vR));
            }
        });

        btSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double vA, vB, vR;

                vA = Double.parseDouble(valorA.getText().toString());
                vB = Double.parseDouble(valorB.getText().toString());

                vR = vA - vB;

                resultado.setText(String.valueOf(vR));
            }
        });

        btMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double vA, vB, vR;

                vA = Double.parseDouble(valorA.getText().toString());
                vB = Double.parseDouble(valorB.getText().toString());

                vR = vA * vB;

                resultado.setText(String.valueOf(vR));
            }
        });

        btDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double vA, vB, vR;

                vA = Double.parseDouble(valorA.getText().toString());
                vB = Double.parseDouble(valorB.getText().toString());

                vR = vA / vB;

                resultado.setText(String.valueOf(vR));
            }
        });
    }
}
