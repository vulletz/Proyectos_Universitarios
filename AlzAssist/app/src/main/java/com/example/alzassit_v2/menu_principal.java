package com.example.alzassit_v2;

        import android.content.Intent;
        import android.content.res.ColorStateList;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import android.bluetooth.BluetoothAdapter;
        import android.bluetooth.BluetoothDevice;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.constraintlayout.widget.ConstraintLayout;
        import java.util.Set;

public class menu_principal extends AppCompatActivity {
    private static final int REQUEST_ENABLE_BT = 1;
    private BluetoothAdapter bluetoothAdapter;
    private Button connectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        Button btnConfiguracionSensores = findViewById(R.id.btnConfiguracionSensores);
        Button btnAlertasSeguridad = findViewById(R.id.btnAlertasSeguridad);
        Button btnResumenDiario = findViewById(R.id.btnResumenDiario);
        connectButton = findViewById(R.id.connectButton);

        int colorFondo_1 = Color.parseColor("#E5F4FB");
        btnConfiguracionSensores.setBackgroundTintList(ColorStateList.valueOf(colorFondo_1));
        int colorTexto_1 = Color.parseColor("#041C3C");
        btnConfiguracionSensores.setTextColor(colorTexto_1);

        int colorFondo_2 = Color.parseColor("#E5F4FB");
        btnAlertasSeguridad.setBackgroundTintList(ColorStateList.valueOf(colorFondo_2));
        int colorTexto_2 = Color.parseColor("#041C3C");
        btnAlertasSeguridad.setTextColor(colorTexto_2);

        int colorFondo_3 = Color.parseColor("#E5F4FB");
        btnResumenDiario.setBackgroundTintList(ColorStateList.valueOf(colorFondo_3));
        int colorTexto_3 = Color.parseColor("#041C3C");
        btnResumenDiario.setTextColor(colorTexto_3);


        btnConfiguracionSensores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción al hacer clic en "Configuracion de Sensores"
                Intent intent = new Intent(menu_principal.this, config_sens.class);
                startActivity(intent);
            }
        });

        btnAlertasSeguridad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu_principal.this, aler_seguridad.class);
                startActivity(intent);
            }
        });

        btnResumenDiario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu_principal.this, res_diario.class);
                startActivity(intent);
            }
        });
    }
    private void enableBluetooth() {
        if (!bluetoothAdapter.isEnabled()) {
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
        } else {
            showPairedDevices();
        }
    }

    private void showPairedDevices() {
        Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
        if (pairedDevices.size() > 0) {
            // Mostrar un cuadro de diálogo o una lista de los dispositivos emparejados
            // Aquí puedes implementar la lógica para seleccionar el dispositivo Bluetooth deseado
            // y establecer la conexión con el módulo Arduino

            // Por ejemplo, puedes imprimir los nombres de los dispositivos emparejados
            for (BluetoothDevice device : pairedDevices) {
                Toast.makeText(this, "Dispositivo emparejado: " + device.getName(), Toast.LENGTH_SHORT).show();
            }

            // También puedes conectar automáticamente a un dispositivo en particular si ya está emparejado
            // utilizando el método connectToDevice(device)
        } else {
            Toast.makeText(this, "No hay dispositivos emparejados", Toast.LENGTH_SHORT).show();
        }
    }

    // Método para conectar a un dispositivo Bluetooth específico
    private void connectToDevice(BluetoothDevice device) {
        // Aquí puedes implementar la lógica para establecer la conexión con el módulo Arduino
        // Puedes usar una clase BluetoothSocket para manejar la comunicación con el dispositivo
        // y establecer una conexión Bluetooth. Este código variará dependiendo de tu configuración y necesidades.

        // Ejemplo básico para conectar a un dispositivo específico
        // BluetoothSocket socket = device.createRfcommSocketToServiceRecord(MY_UUID);
        // socket.connect();

        Toast.makeText(this, "Conexión establecida con " + device.getName(), Toast.LENGTH_SHORT).show();
    }

    // Este método se llama cuando regresas de la solicitud de habilitar Bluetooth
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_ENABLE_BT) {
            if (resultCode == RESULT_OK) {
                showPairedDevices();
            } else {
                Toast.makeText(this, "Bluetooth no fue habilitado", Toast.LENGTH_SHORT).show();
            }
        }
    }
}

