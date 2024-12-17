package com.example.alzassit_v2;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;
import java.util.UUID;


public class aler_seguridad extends AppCompatActivity {

    private static final String CHANNEL_ID = "notification_channel";
    private Button btnMov_1;
    private Button btnMov_2;
    private PendingIntent pendingIntent;

    private Button butBluetooth;
    private BluetoothAdapter bluetoothAdapter;
    private ConnectTask connectTask;
    private static final String DEVICE_ADDRESS = "00:00:00:00:00:00"; // Dirección Bluetooth del módulo Arduino
    private static final UUID UUID_SERIAL_PORT_PROFILE = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    private BluetoothSocket socket;
    private static final int REQUEST_ENABLE_BT = 1;
    private static final int REQUEST_BLUETOOTH_PERMISSION = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aler_seguridad);

        Button backButton = findViewById(R.id.backButton);
        btnMov_1 = findViewById(R.id.btnMov_1);
        btnMov_2 = findViewById(R.id.btnMov_2);

        butBluetooth = findViewById(R.id.butBluetooth);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        final ImageView imageView1 = findViewById(R.id.detect_top);
        final ImageView imageView2 = findViewById(R.id.detect_inf);

        int colorFondo = Color.parseColor("#E5F4FB");
        int colorTexto = Color.parseColor("#041C3C");

        btnMov_1.setBackgroundTintList(ColorStateList.valueOf(colorFondo));
        btnMov_1.setTextColor(colorTexto);

        btnMov_2.setBackgroundTintList(ColorStateList.valueOf(colorFondo));
        btnMov_2.setTextColor(colorTexto);


        backButton.setBackgroundColor(Color.TRANSPARENT);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cerrar la actividad actual y volver a la actividad anterior
            }
        });

        btnMov_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    showNotification();
                    imageView1.setImageResource(R.drawable.detect_activo);
                } else {
                    showNewNotification();
                }
            }
        });

        btnMov_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    showNotification();
                    imageView2.setImageResource(R.drawable.detect_activo);
                } else {
                    showNewNotification();
                    //imageView2.setImageResource(R.drawable.detect_no_activo);
                }
            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.detect_no_activo);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2.setImageResource(R.drawable.detect_no_activo);
            }
        });

        butBluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                connectTask = new ConnectTask(aler_seguridad.this);
                if (ContextCompat.checkSelfPermission(aler_seguridad.this, Manifest.permission.BLUETOOTH) == PackageManager.PERMISSION_GRANTED
                        && ContextCompat.checkSelfPermission(aler_seguridad.this, Manifest.permission.BLUETOOTH_ADMIN) == PackageManager.PERMISSION_GRANTED) {
                    if (!bluetoothAdapter.isEnabled()) {
                        Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                        startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
                    } else {
                        connectTask.execute();
                    }
                } else {
                    ActivityCompat.requestPermissions(aler_seguridad.this,
                            new String[]{Manifest.permission.BLUETOOTH, Manifest.permission.BLUETOOTH_ADMIN},
                            REQUEST_BLUETOOTH_PERMISSION);
                }
            }
        });

    }

    private void showNotification() {
        NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "NEW", NotificationManager.IMPORTANCE_DEFAULT);
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        manager.createNotificationChannel(channel);
        showNewNotification();
    }

    private void showNewNotification() {
        setPendingIntent(HomeActivity.class);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(),
                CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_notification)
                .setContentTitle("Notificacion de Sensor")
                .setContentText("-| El sensor de movimiento a sido activado |-")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(pendingIntent);
        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(getApplicationContext());
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        managerCompat.notify(1, builder.build());
    }

    private void setPendingIntent(Class<?> clsActivity) {
        Intent intent = new Intent(this, clsActivity);
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(clsActivity);
        stackBuilder.addNextIntent(intent);
        pendingIntent = stackBuilder.getPendingIntent(1, PendingIntent.FLAG_UPDATE_CURRENT);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_BLUETOOTH_PERMISSION) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED
                    && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
                if (!bluetoothAdapter.isEnabled()) {
                    Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                    if (ActivityCompat.checkSelfPermission(this, Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
                } else {
                    connectTask.execute();
                }
            } else {
                // El usuario denegó los permisos, manejar aquí
            }
        }
    }

    private class ConnectTask extends AsyncTask<Void, Void, Boolean> {
        private Context context;

        public ConnectTask(Context context) {
            this.context = context;
        }

        @Override
        protected Boolean doInBackground(Void... params) {
            try {
                BluetoothDevice device = bluetoothAdapter.getRemoteDevice(DEVICE_ADDRESS);
                if (ContextCompat.checkSelfPermission(context, Manifest.permission.BLUETOOTH) == PackageManager.PERMISSION_GRANTED
                        && ContextCompat.checkSelfPermission(context, Manifest.permission.BLUETOOTH_ADMIN) == PackageManager.PERMISSION_GRANTED) {
                    socket = device.createInsecureRfcommSocketToServiceRecord(UUID_SERIAL_PORT_PROFILE);
                    socket.connect();
                    return true;
                } else {
                    // Los permisos no están garantizados, manejar aquí
                    return false;
                }
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            } catch (SecurityException e) {
                e.printStackTrace();
                return false;
            }
        }


        @Override
        protected void onPostExecute(Boolean result) {
            super.onPostExecute(result);
            if (result) {
                // La conexión se estableció correctamente
                showToast("Conexión establecida");
                // Realiza acciones adicionales con el módulo Bluetooth, si es necesario
            } else {
                // Hubo un error en la conexión
                showToast("Error al conectar");
            }
        }
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
