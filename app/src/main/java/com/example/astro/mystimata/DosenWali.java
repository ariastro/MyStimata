package com.example.astro.mystimata;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DosenWali extends AppCompatActivity {
    TextView font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosen_wali);

        font = (TextView) findViewById(R.id.footer);
        Typeface CustomFontt11 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFontt11);

        font = (TextView) findViewById(R.id.namaBuDwi);
        Typeface CustomFont2 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFont2);

        font = (TextView) findViewById(R.id.emailBuDwi);
        Typeface CustomFont3 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFont3);

        font = (TextView) findViewById(R.id.hpBuDwi);
        Typeface CustomFont4 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFont4);

    }
}
