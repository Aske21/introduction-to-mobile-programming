package com.example.mobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.mobileproject.room.entities.RecipeDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_page);
        CharSequence text = "I am a toast sss";
        Toast t1 = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        t1.show();


    }
}