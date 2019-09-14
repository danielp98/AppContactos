package com.example.appcontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<ObjetoContacto> listacontactos;
    String[] listacontactosstring;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listacontactos = new ArrayList<ObjetoContacto>();
    }

    public void ActividadAgregar (View view){
        Intent intent = new Intent(this, Agregarcontacto.class);
        startActivityForResult(intent, 1);
    }

    public void onActivityResult (int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bundle objetorecibido = data.getExtras();
        ObjetoContacto contacto = null;

        if(requestCode == 1){
            if(resultCode == MainActivity.RESULT_OK){
                contacto = (ObjetoContacto) objetorecibido.getSerializable("contacto");
                if(contacto != null){
                    listacontactos.add(contacto);
                }
            }
        }

        listacontactosstring = new String[listacontactos.size()];

        for(int i = 0; i < listacontactos.size(); i++){
            listacontactosstring[i] = listacontactos.get(i).nombre.concat("\n").concat(listacontactos.get(i).email);
        }

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listacontactosstring);

        ListView listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(adapter);



    }

}