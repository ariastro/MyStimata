package com.example.astro.mystimata;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.astro.mystimata.Fragment.HelpFragment;
import com.example.astro.mystimata.Fragment.HomeFragment;
import com.example.astro.mystimata.Fragment.ProfileFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch(position) {

            case 0:
                HomeFragment HomeFragment = new HomeFragment();
                return HomeFragment;
            case 1:
                HelpFragment HelpFragment = new HelpFragment();
                return HelpFragment;
            case 2:
                ProfileFragment ProfileFragment = new ProfileFragment();
                return ProfileFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;

    }
}