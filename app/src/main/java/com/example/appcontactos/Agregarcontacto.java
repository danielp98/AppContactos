package com.example.appcontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class Agregarcontacto extends AppCompatActivity {

    EditText text1;
    EditText text2;
    EditText text3;
    EditText text4;
    EditText text5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregarcontacto);
        text1 = (EditText)findViewById(R.id.editTextUsuario);
        text2 = (EditText)findViewById(R.id.editTextEmail);
        text3 = (EditText)findViewById(R.id.editTexttwitter);
        text4 = (EditText)findViewById(R.id.editTextTel);
        text5 = (EditText)findViewById(R.id.editTextFechaNac);
    }

    public void onClick(View view){
        ObjetoContacto objetocontacto = new ObjetoContacto(text1.getText().toString(),
                text2.getText().toString(), text3.getText().toString(),
                text4.getText().toString(), text5.getText().toString());

        Intent intent = new Intent(Agregarcontacto.this, MainActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("contacto", objetocontacto);

        intent.putExtras(bundle);
        setResult(RESULT_OK, intent);
        finish();

    }
}
