package com.lagn.mascotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CardView extends AppCompatActivity {

private TextView lik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);




         lik=findViewById(R.id.likestxt);
         lik.setText("likes");
    }
}