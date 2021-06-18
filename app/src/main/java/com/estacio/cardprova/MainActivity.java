package com.estacio.cardprova;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    private CardView eletroCard, belezaCard;
    private Button sairBtn, voltarBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eletroCard = (CardView) findViewById(R.id.eletro_card);
        belezaCard = (CardView) findViewById(R.id.beleza_card);


        eletroCard.setOnClickListener(this);
        belezaCard.setOnClickListener(this);

        sairBtn = findViewById(R.id.sairBtn);

        sairBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.sairBtn)
                    finish();
            }
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

    @Override
    public void onClick(View v) {
        Intent cards;


        switch (v.getId()){
            case R.id.eletro_card : cards = new Intent(this,EletroCard.class); startActivity(cards); break;
            case R.id.beleza_card : cards = new Intent(this,BelezaCard.class); startActivity(cards); break;
            default:break;

        }

    }
}