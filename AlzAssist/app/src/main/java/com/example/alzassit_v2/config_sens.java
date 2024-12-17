package com.example.alzassit_v2;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class config_sens extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.config_sens);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button backButton = findViewById(R.id.backButton);

        int colorFondo_1 = Color.parseColor("#E5F4FB");
        button1.setBackgroundTintList(ColorStateList.valueOf(colorFondo_1));
        int colorTexto_1 = Color.parseColor("#041C3C");
        button1.setTextColor(colorTexto_1);

        int colorFondo_2 = Color.parseColor("#E5F4FB");
        button2.setBackgroundTintList(ColorStateList.valueOf(colorFondo_2));
        int colorTexto_2 = Color.parseColor("#041C3C");
        button2.setTextColor(colorTexto_2);

        int colorFondo_3 = Color.parseColor("#E5F4FB");
        button3.setBackgroundTintList(ColorStateList.valueOf(colorFondo_3));
        int colorTexto_3 = Color.parseColor("#041C3C");
        button3.setTextColor(colorTexto_3);

        backButton.setBackgroundColor(Color.TRANSPARENT);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cerrar la actividad actual y volver a la actividad anterior
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para el botón 1
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para el botón 2
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para el botón 3
            }
        });
    }
}
