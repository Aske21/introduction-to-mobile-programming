package com.example.mobileproject.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.mobileproject.R;
import com.example.mobileproject.adapters.LoginAdapter;
import com.google.android.material.tabs.TabLayout;



public class LoginTabFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);

        View email = root.findViewById(R.id.email);
        View pass = root.findViewById(R.id.view_pager);
        View google = root.findViewById(R.id.fab_google);


        return root;
    }
}
