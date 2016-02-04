package com.example.admin.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.admin.techadroit.Codewars;
import com.example.admin.techadroit.DesignMania;

/**
 * Created by admin on 2/2/2016.
 */
public class TabsPagerAdapterCSE extends FragmentPagerAdapter {
    public TabsPagerAdapterCSE(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new Codewars();
            case 1:
                // Games fragment activity
                return new DesignMania();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 2;
    }

}
