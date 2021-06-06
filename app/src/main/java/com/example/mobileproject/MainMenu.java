package com.example.mobileproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_page);

        TabLayout tabLayout = findViewById(R.id.TabHome);
        TabItem Home = findViewById(R.id.Home);
        TabItem Browse = findViewById(R.id.Browse);
        TabItem MyRecipes = findViewById(R.id.MyRecipes);
        ViewPager viewPager = findViewById(R.id.view_pager2);
    }
}
