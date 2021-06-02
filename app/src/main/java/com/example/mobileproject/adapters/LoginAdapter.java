package com.example.mobileproject.adapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mobileproject.fragments.LoginTabFragment;
import com.example.mobileproject.fragments.RegisterTabFragment;

public class LoginAdapter extends FragmentPagerAdapter {


    private Context context;
    int toolTabs;


    public LoginAdapter(FragmentManager fm, Context context, int toolTabs) {
        super(fm);
        this.context = context;
        this.toolTabs = toolTabs;
    }

    @Override
    public int getCount() {
        return toolTabs;
    }

    public Fragment getItem(int position){
        switch(position){
            case 0:
                LoginTabFragment loginTabFragment = new LoginTabFragment();
                return loginTabFragment;

            case 1:
                RegisterTabFragment registerTabFragment = new RegisterTabFragment();
                return registerTabFragment;
            default:
                return null;

        }


    }
}
