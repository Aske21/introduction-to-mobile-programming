package com.example.mobileproject.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mobileproject.fragments.BrowseFragment;
import com.example.mobileproject.fragments.HomeFragment;
import com.example.mobileproject.fragments.MyRecipesFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numoftabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numoftabs = numOfTabs;
    }
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new BrowseFragment();
            case 2:
                return new MyRecipesFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object){
        return POSITION_NONE;
    }
}
