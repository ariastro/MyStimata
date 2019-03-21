package com.example.astro.mystimata;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText mnim = (EditText) findViewById(R.id.enterNim);
        final EditText mpass = (EditText) findViewById(R.id.enterPass);
        Button mlogin = (Button) findViewById(R.id.login);

        mlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mnim.getText().toString().isEmpty() && mpass.getText().toString().isEmpty()) {
                    mnim.setError("NIM tidak boleh kosong");
                    mpass.setError("Password tidak boleh kosong");
                }else if (mnim.getText().toString().isEmpty()){
                    mnim.setError("NIM tidak boleh kosong");
                }else if (mpass.getText().toString().isEmpty()){
                    mpass.setError("Password tidak boleh kosong");
                }else if (mnim.getText().toString().trim().equalsIgnoreCase("admin")
                        && mpass.getText().toString().trim().equalsIgnoreCase("admin")){
                    Intent loginIntent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(loginIntent);
                    finish();
                }else{
                    Toast.makeText(LoginActivity.this, "Your NIM or Password is Incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void forgetPass(View view) {
        Intent forgetIntent = new Intent(LoginActivity.this, ForgetPassword.class);
        startActivity(forgetIntent);
    }

}
