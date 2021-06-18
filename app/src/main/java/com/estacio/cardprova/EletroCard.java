package com.estacio.cardprova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EletroCard extends AppCompatActivity {

    private Button sairBtn, voltarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eletro_card);






        sairBtn = findViewById(R.id.sairBtn);

        sairBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.sairBtn)
                    finishAffinity();            }
        });

        voltarBtn = findViewById(R.id.voltarBtn);

        voltarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.voltarBtn){
                    onBackPressed();
                }
            }
        });

    }
 }
