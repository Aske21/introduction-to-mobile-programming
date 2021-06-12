package com.example.mobileproject.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.mobileproject.MainActivity;
import com.example.mobileproject.MainMenu;
import com.example.mobileproject.R;
import com.example.mobileproject.activities.AddingScreen;
import com.example.mobileproject.adapters.LoginAdapter;
import com.example.mobileproject.room.entities.RecipeDatabase;
import com.example.mobileproject.room.entities.User;
import com.google.android.material.tabs.TabLayout;



public class LoginTabFragment extends Fragment {


    // var
    private EditText email;
    private EditText password;
    private Button login_btn;

    // db
    private RecipeDatabase recipeDatabase;


    public LoginTabFragment() {
        super(R.layout.login_tab_fragment);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);

        // need to figure out how to get text views and password views


        recipeDatabase = recipeDatabase.getInstance(this.getContext());

        email = (EditText) root.findViewById(R.id.email);
        password = (EditText) root.findViewById(R.id.password);

        login_btn = root.findViewById(R.id.login_button);
        login_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                login(v);

            }
        });

        return root;
    }




    // login  method - needs work
    public void login(View view){


        String email_field = email.getText().toString();
        String password_field = password.getText().toString();


        // probably need to parse to string in order for it to be able to check users
        User user = recipeDatabase.getInstance(this.getContext()).userDao().getUserByEmail(email_field);


        if(user != null && user.getPassword().equals(password_field)){
            // logic
            System.out.println("Success!");
            Intent i = new Intent(getActivity(), MainMenu.class);
            startActivity(i);
            return;
        }else{
            System.out.println("error");
        }

        Toast.makeText(requireActivity(), "Welcome to Foody", Toast.LENGTH_SHORT).show();
        // might work need to test more
    }




}
