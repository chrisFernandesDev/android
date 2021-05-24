package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class Result extends AppCompatActivity {

    public ImageView imagemResult;
    private ImageButton voltarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        imagemResult = findViewById(R.id.imagemResult);
        voltarButton = findViewById(R.id.voltarButton);

        imagemResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = new Random().nextInt(2);

                if (numero == 0){
                    imagemResult.setImageResource(R.drawable.moeda_coroa);
                }else {
                    imagemResult.setImageResource(R.drawable.moeda_cara);
                }
            }
        });

        voltarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
