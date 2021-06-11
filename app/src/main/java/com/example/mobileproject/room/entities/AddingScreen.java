package com.example.mobileproject.room.entities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobileproject.R;

public class AddingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adding_screen);
    }

    public void buttonClick(View v) {
        switch(v.getId()) {
            case R.id.MyRecipesAdd:
                Intent myIntent = new Intent();
                startActivity(myIntent);
                break;
        }
    }
}
