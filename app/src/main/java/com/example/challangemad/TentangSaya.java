package com.example.challangemad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TentangSaya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_saya);
    }
    public void backButton(View view) {
        Intent intent = new Intent(this, MenuUtama.class);
        startActivity(intent);
    }
}