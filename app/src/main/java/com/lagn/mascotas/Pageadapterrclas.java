package com.lagn.mascotas;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class Pageadapterrclas extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragments;


    public Pageadapterrclas( FragmentManager fm,ArrayList<Fragment>fragments) {
        super(fm);
        this.fragments=fragments;

    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
