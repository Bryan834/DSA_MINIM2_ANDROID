package com.example.loginregister;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Ej2Minimo2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensajes);

        // Obtener la lista de mensajes del intent o de donde sea que la tengas
        List<String> mensajes = obtenerMensajesDesdeIntent();

        // Configurar el adaptador para el ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mensajes);

        // Configurar el ListView
        ListView listViewMensajes = findViewById(R.id.listViewMensajes);
        listViewMensajes.setAdapter(adapter);
    }

    // Método de ejemplo para obtener la lista de mensajes desde el intent
    private List<String> obtenerMensajesDesdeIntent() {
        List<String> mensajes = new ArrayList<>();
        mensajes.add("Mensaje 1");
        mensajes.add("Mensaje 2");
        mensajes.add("Mensaje 3");
        // Agrega más mensajes según tus necesidades
        return mensajes;
    }
}
