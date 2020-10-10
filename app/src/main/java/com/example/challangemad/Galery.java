package com.example.challangemad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Galery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);
    }
    public void backButton(View view) {
        Intent intent = new Intent(this, MenuUtama.class);
        startActivity(intent);
    }
}