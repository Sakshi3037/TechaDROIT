package com.example.admin.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.admin.techadroit.CrossRoads;
import com.example.admin.techadroit.FastnFurious;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }@Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FastnFurious();
            case 1:
                return new CrossRoads();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
