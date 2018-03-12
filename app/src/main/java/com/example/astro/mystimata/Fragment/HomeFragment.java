package com.example.astro.mystimata.Fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.astro.mystimata.DosenWali;
import com.example.astro.mystimata.JadwalKuliah;
import com.example.astro.mystimata.KHS;
import com.example.astro.mystimata.KRS;
import com.example.astro.mystimata.R;
import com.example.astro.mystimata.SebaranMataKuliah;
import com.example.astro.mystimata.Transkip;


public class HomeFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        ImageButton dosenWali = (ImageButton) v.findViewById(R.id.dosenWali);
        ImageButton krs = (ImageButton) v.findViewById(R.id.krs);
        ImageButton khs = (ImageButton) v.findViewById(R.id.khs);
        ImageButton jadwal = (ImageButton) v.findViewById(R.id.jadwal);
        ImageButton sebaran = (ImageButton) v.findViewById(R.id.sebaran);
        ImageButton transkip = (ImageButton) v.findViewById(R.id.transkip);

        dosenWali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dosenWaliIntent = new Intent(HomeFragment.this.getActivity(), DosenWali.class);
                startActivity(dosenWaliIntent);
            }
        });

        krs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent KrsIntent = new Intent(HomeFragment.this.getActivity(), KRS.class);
                startActivity(KrsIntent);
            }
        });

        khs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent KhsIntent = new Intent(HomeFragment.this.getActivity(), KHS.class);
                startActivity(KhsIntent);
            }
        });

        jadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jadwalIntent = new Intent(HomeFragment.this.getActivity(), JadwalKuliah.class);
                startActivity(jadwalIntent);
            }
        });

        sebaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sebaranmtIntent = new Intent(HomeFragment.this.getActivity(), SebaranMataKuliah.class);
                startActivity(sebaranmtIntent);
            }
        });

        transkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent transkipIntent = new Intent(HomeFragment.this.getActivity(), Transkip.class);
                startActivity(transkipIntent);
            }
        });

        return v;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
