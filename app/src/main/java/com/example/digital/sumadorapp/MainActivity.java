package com.example.digital.sumadorapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.color.holo_red_dark;

public class MainActivity extends AppCompatActivity {
    Integer resultado = 0;
    float tamano = 60;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        View.OnClickListener listenerResta = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = findViewById(R.id.Textviev);
                resultado -= 1;
                tamano -= 1;
                textView.setTextSize(tamano);
                textView.setText(resultado.toString());
                if (resultado < 0) {
                    textView.setTextColor(Color.RED);

                }

            }
        };

        View.OnClickListener listenerSuma = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = findViewById(R.id.Textviev);
                resultado += 1;
                tamano +=1;
                textView.setText(resultado.toString());
                textView.setTextSize(tamano);
                if (resultado > 0) {
                    textView.setTextColor(Color.GREEN);

                }
            }
        };
        Button SumaBoton = findViewById(R.id.botonSuma);
        SumaBoton.setOnClickListener(listenerSuma);
        Button restaBoton = findViewById(R.id.botonResta);
        restaBoton.setOnClickListener(listenerResta);
    }

}