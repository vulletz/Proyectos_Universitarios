package com.example.alzassit_v2;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.SharedPreferences;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class res_diario extends AppCompatActivity {

    private static final String PREFS_NAME = "DailyNotifications";
    private static final String PREF_KEY_NOTIFICATION = "dailyNotification";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.res_diario);

        Button backButton = findViewById(R.id.backButton);
        backButton.setBackgroundColor(Color.TRANSPARENT);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cerrar la actividad actual y volver a la actividad anterior
            }
        });

        // Obtener la notificación diaria almacenada
        SharedPreferences sharedPreferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        String notification = sharedPreferences.getString(PREF_KEY_NOTIFICATION, "");

        // Mostrar la notificación en un TextView o realizar cualquier otra operación necesaria
        TextView notificationTextView = findViewById(R.id.notificationTextView);
        notificationTextView.setText(notification);

    }
}