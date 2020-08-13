package com.lagn.mascotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class pamtalla2 extends AppCompatActivity {
    private EditText name,email, msnjs;
    private Button enviarbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pamtalla2);



        name=findViewById(R.id.nombreID);
        email=findViewById(R.id.emailID);
        msnjs=findViewById(R.id.mensajeID);
        enviarbt=findViewById(R.id.EnviarID);
        enviarmensaje();



    }

    private void enviarmensaje() {

        enviarbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nm= name.getText().toString().trim();
                String eml=email.getText().toString().trim();
                String msj=msnjs.getText().toString();

                Javamail javamail= new Javamail(pamtalla2.this, eml,nm,msj);
                javamail.execute();

            }
        });



    }


}