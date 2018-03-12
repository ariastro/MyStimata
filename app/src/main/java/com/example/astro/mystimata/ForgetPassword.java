package com.example.astro.mystimata;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ForgetPassword extends AppCompatActivity {

    TextView fontt;
    TextView fonttt;
    TextView font3;
    TextView font4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        fontt = (TextView) findViewById(R.id.aa);
        Typeface myCustomFont1 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        fontt.setTypeface(myCustomFont1);

        fonttt = (TextView) findViewById(R.id.aaa);
        Typeface myCustomFont2 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        fonttt.setTypeface(myCustomFont2);

        font3 = (TextView) findViewById(R.id.back);
        Typeface myCustomFontt = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        fontt.setTypeface(myCustomFontt);

        font4 = (TextView) findViewById(R.id.submit);
        Typeface myCustomFonttt = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        fontt.setTypeface(myCustomFonttt);

        final EditText email = (EditText) findViewById(R.id.enterEmail);
        final TextView submit = (TextView) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!email.getText().toString().isEmpty()) {
                    Toast.makeText(ForgetPassword.this,
                            R.string.submit_alert,
                            Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(ForgetPassword.this,
                            R.string.error_submit_msg,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void back(View view) {
        Intent backIntent = new Intent(ForgetPassword.this, LoginActivity.class);
        startActivity(backIntent);
    }

    //public void submit(View view) {
    //  Intent sumbitIntent = new Intent(ForgetPassword.this, LoginActivity.class);
    //startActivity(sumbitIntent);
    //}
}
