package com.example.astro.mystimata;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.astro.mystimata.Fragment.HelpFragment;

public class QuestionActivity extends AppCompatActivity {
    TextView font;
    TextView quest;
    TextView ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        font = (TextView) findViewById(R.id.footer);
        Typeface CustomFont2 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFont2);

        font = (TextView) findViewById(R.id.quest);
        Typeface CustomFont = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFont);

        font = (TextView) findViewById(R.id.ans);
        Typeface CustomFont3 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFont3);

        font = (TextView) findViewById(R.id.q);
        Typeface CustomFont4 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFont4);

        font = (TextView) findViewById(R.id.answer);
        Typeface CustomFont5 = Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
        font.setTypeface(CustomFont5);

        quest = (TextView) findViewById(R.id.q);
        ans = (TextView) findViewById(R.id.answer);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            quest.setText(bundle.getString("ListQuestions"));
            //toolbarQuestion.setTitle(bundle.getString("ListQuestions"));
            if (quest.getText().toString().equalsIgnoreCase("Mengapa saya tidak dapat mengisi KRS ?")) {
                ans.setText(getIntent().getExtras().getString("Answer"));
            } else if (quest.getText().toString().equalsIgnoreCase("Mengapa tombol logout tidak berfungsi ?")) {
                ans.setText(getIntent().getExtras().getString("Answer2"));
            } else if (quest.getText().toString().equalsIgnoreCase("Mengapa aplikasi sering hang ?")) {
                ans.setText(getIntent().getExtras().getString("Answer3"));
            } else if (quest.getText().toString().equalsIgnoreCase("Caranya login gimana ?")) {
                ans.setText(getIntent().getExtras().getString("Answer4"));
            } else if (quest.getText().toString().equalsIgnoreCase("Cheat GTA darah kebal apaan woi ?")) {
                ans.setText(getIntent().getExtras().getString("Answer5"));
            } else if (quest.getText().toString().equalsIgnoreCase("Kenapa KHS saya nilainya jelek ?")) {
                ans.setText(getIntent().getExtras().getString("Answer6"));
            } else if (quest.getText().toString().equalsIgnoreCase("Bisa hack KHS gak ?")) {
                ans.setText(getIntent().getExtras().getString("Answer7"));
            } else if (quest.getText().toString().equalsIgnoreCase("Kapan nikah ?")) {
                ans.setText(getIntent().getExtras().getString("Answer8"));
            }

        }

    }
}
