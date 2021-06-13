package com.example.mobileproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.mobileproject.activities.AddingScreen;
import com.example.mobileproject.activities.LoginActivity;
import com.example.mobileproject.adapters.CurrentUser;
import com.example.mobileproject.adapters.PagerAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;



public class MainMenu extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPagerMMenu;
    private TabItem tab1, tab2, tab3;
    public PagerAdapter pagerAdapter;
    public CurrentUser currentUser;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_page);

        tabLayout = (TabLayout) findViewById(R.id.TabHome);
        tab1 = (TabItem) findViewById(R.id.Home);
        tab2 = (TabItem) findViewById(R.id.Browse);
        tab3 = (TabItem) findViewById(R.id.MyRecipes);
        viewPagerMMenu = (ViewPager) findViewById(R.id.view_pager2);

        pagerAdapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPagerMMenu.setAdapter(pagerAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab){
                viewPagerMMenu.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0){
                    pagerAdapter.notifyDataSetChanged();
                }
                else if (tab.getPosition() == 1){
                    pagerAdapter.notifyDataSetChanged();
                }
                else if (tab.getPosition() == 2){
                    pagerAdapter.notifyDataSetChanged();
                }

            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab){
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab){
            }

        });

        viewPagerMMenu.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }


    public void Logout(View view) {

        CurrentUser.getCurrentUser().deleteUser();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
