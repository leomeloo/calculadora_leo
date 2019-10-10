package com.example.aula3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

public class ResultActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        EditText resultado;

        Bundle result = getIntent().getExtras();

        double value;
        value = result.getDouble("vR2");
        int valueint = (int) value;


        resultado = findViewById(R.id.mostrarResultado);
        resultado.setText(String.valueOf(valueint));


    }
}
