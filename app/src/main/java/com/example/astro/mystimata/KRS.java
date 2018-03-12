package com.example.astro.mystimata;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.astro.mystimata.Fragment.ProfileFragment;

public class KRS extends AppCompatActivity {
    TextView font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krs);

        font = (TextView) findViewById(R.id.footer);
        Typeface CustomFontt11 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFontt11);

        Button submit = (Button) findViewById(R.id.submitKrs);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mbuilder = new AlertDialog.Builder(KRS.this);
                View mview = getLayoutInflater().inflate(R.layout.dialog_krs, null);
                Button ok = (Button) mview.findViewById(R.id.buttonoke);

                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent noIntent = new Intent(KRS.this, HomeActivity.class);
                        startActivity(noIntent);
                    }
                });

                mbuilder.setView(mview);
                AlertDialog dialog = mbuilder.create();
                dialog.show();
            }
        });

    }

}
