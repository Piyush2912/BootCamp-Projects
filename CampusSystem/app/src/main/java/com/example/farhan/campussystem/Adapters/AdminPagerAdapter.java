package com.example.farhan.campussystem.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by Farhan on 3/9/2018.
 */

public class AdminPagerAdapter extends FragmentStatePagerAdapter {

    ArrayList<Fragment> fragments;
    private String tabTitles[] = new String[]{"Student List", "Company List", "Company Jobs"};

    public AdminPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
