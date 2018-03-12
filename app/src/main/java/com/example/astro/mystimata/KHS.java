package com.example.astro.mystimata;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class KHS extends AppCompatActivity {
    TextView font;
    private Spinner spinner_smt_khs;
    private int nsmtkhs = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khs);

        Button procces_khs = (Button) findViewById(R.id.process_khs);
        final ImageView hasil = (ImageView) findViewById(R.id.hasil);
        spinner_smt_khs = (Spinner) findViewById(R.id.smt_khs);
        setupSpinner();

        procces_khs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (spinner_smt_khs.getSelectedItem().toString().equals("1")){
                    hasil.setImageDrawable(ContextCompat.getDrawable(KHS.this,
                            R.drawable.khs1));
                }else if (spinner_smt_khs.getSelectedItem().toString().equals("2")) {
                    hasil.setImageDrawable(ContextCompat.getDrawable(KHS.this,
                            R.drawable.khs2));
                }else{
                    hasil.setImageDrawable(ContextCompat.getDrawable(KHS.this,
                            R.drawable.khs3));
                }
            }
        });

        font = (TextView) findViewById(R.id.khs1);
        Typeface CustomFontt1 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFontt1);

        font = (TextView) findViewById(R.id.footer);
        Typeface CustomFontt11 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFontt11);

        font = (TextView) findViewById(R.id.khs2);
        Typeface CustomFontt2 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFontt2);

        font = (TextView) findViewById(R.id.khs3);
        Typeface CustomFontt3 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFontt3);

        font = (TextView) findViewById(R.id.khs4);
        Typeface CustomFontt4 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFontt4);
    }

    private void setupSpinner() {
        ArrayAdapter khsSpinnerAdapter = ArrayAdapter.createFromResource (this,R.array.array_smt_khs,android.R.layout.simple_spinner_item);
        khsSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        spinner_smt_khs.setAdapter(khsSpinnerAdapter);
        spinner_smt_khs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selection = (String) adapterView.getItemAtPosition(i);
                if (!TextUtils.isEmpty(selection)) {
                    if (selection.equals("1"))
                        nsmtkhs = 1;
                    else if (selection.equals("2"))
                        nsmtkhs = 2;
                    else
                        nsmtkhs = 0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}
