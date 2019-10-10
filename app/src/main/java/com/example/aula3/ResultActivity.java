package com.example.aula3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ResultActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        EditText resultado;

        String vR = getIntent().getStringExtra("vR2");

        resultado = findViewById(R.id.mostrarResultado);
        resultado.setText(String.valueOf(vR));
    }
}
