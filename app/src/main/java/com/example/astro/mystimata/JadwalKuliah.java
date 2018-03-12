package com.example.astro.mystimata;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class JadwalKuliah extends AppCompatActivity {
    TextView font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_kuliah);

        font = (TextView) findViewById(R.id.footer);
        Typeface CustomFontt11 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFontt11);

    }
}
