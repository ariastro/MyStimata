package com.example.astro.mystimata.Fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.astro.mystimata.QuestionActivity;
import com.example.astro.mystimata.R;

public class HelpFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public HelpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_help, container, false);


        FloatingActionButton ask = (FloatingActionButton) view.findViewById(R.id.ask);
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto: "));
                intent.putExtra(Intent.EXTRA_SUBJECT, " ASK A QUESTION ");
                String[] to = {"ariastronout@gmail.com","ariastro@mail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL, to);
                startActivity(intent);
            }
        });

        final ListView listView = (ListView) view.findViewById(R.id.menu);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(HelpFragment.this.getActivity(),
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.question));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent listIntent = new Intent(HelpFragment.this.getActivity(), QuestionActivity.class);
                listIntent.putExtra("ListQuestions", listView.getItemAtPosition(i).toString());
                listIntent.putExtra("Answer", getString(R.string.q1));
                listIntent.putExtra("Answer2", getString(R.string.q2));
                listIntent.putExtra("Answer3", getString(R.string.q3));
                listIntent.putExtra("Answer4", getString(R.string.q4));
                listIntent.putExtra("Answer5", getString(R.string.q5));
                listIntent.putExtra("Answer6", getString(R.string.q6));
                listIntent.putExtra("Answer7", getString(R.string.q7));
                listIntent.putExtra("Answer8", getString(R.string.q8));
                startActivity(listIntent);
            }
        });

        listView.setAdapter(listViewAdapter);

        return view;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
