package com.example.astro.mystimata;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Transkip extends AppCompatActivity {
    TextView font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transkip);

        font = (TextView) findViewById(R.id.footer);
        Typeface CustomFontt11 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFontt11);

        font = (TextView) findViewById(R.id.k1);
        Typeface CustomFontt1 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFontt1);

        font = (TextView) findViewById(R.id.k2);
        Typeface CustomFontt2 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFontt2);

        font = (TextView) findViewById(R.id.k3);
        Typeface CustomFontt3 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFontt3);

        font = (TextView) findViewById(R.id.k4);
        Typeface CustomFontt4 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFontt4);

        final ImageView output = (ImageView) findViewById(R.id.output);
        Button process = (Button) findViewById(R.id.process_k);
        process.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setImageDrawable(ContextCompat.getDrawable(Transkip.this,
                        R.drawable.qqwe));
            }
        });

    }
}