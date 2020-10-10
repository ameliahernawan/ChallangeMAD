package com.example.challangemad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterKehadiran extends AppCompatActivity {

    Button tombolMinus, tombolPlus;
    TextView CounterTV;

    int nilai = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter_kehadiran);

        tombolMinus = findViewById(R.id.minusButton);
        tombolPlus = findViewById(R.id.plusButton);
        CounterTV  = findViewById(R.id.TVCounter);

        tombolPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai = nilai + 1;
                CounterTV.setText(String.valueOf(nilai));
            }
        });

        tombolMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai = nilai - 1;
                CounterTV.setText(String.valueOf(nilai));

            }
        });

    }

    public void backButton(View view) {
        Intent intent = new Intent(this, MenuUtama.class);
        startActivity(intent);
    }

}