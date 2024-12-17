package com.example.alzassit_v2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.res.ColorStateList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout rootView = findViewById(R.id.rootLayout);
        rootView.setBackgroundColor(Color.parseColor("#041C3C"));

        Button buttonLogin = findViewById(R.id.buttonLogin);
        int colorFondo = Color.parseColor("#E5F4FB");
        buttonLogin.setBackgroundTintList(ColorStateList.valueOf(colorFondo));
        int colorTexto = Color.parseColor("#041C3C");
        buttonLogin.setTextColor(colorTexto);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, menu_principal.class);
                startActivity(intent);
            }
        });
    }
}
