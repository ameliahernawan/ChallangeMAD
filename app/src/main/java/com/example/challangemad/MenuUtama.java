package com.example.challangemad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
    }
    public void tentangsayaButton(View view) {
        Intent intent = new Intent(this, TentangSaya.class);
        startActivity(intent);
    }
    public void counterButton(View view) {
        Intent intent = new Intent(this, CounterKehadiran.class);
        startActivity(intent);
    }
    public void galeriButton(View view) {
        Intent intent = new Intent(this, Galery.class);
        startActivity(intent);
    }
    public void backButton(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}