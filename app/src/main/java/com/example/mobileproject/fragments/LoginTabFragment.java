package com.example.mobileproject.fragments;

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
import com.example.mobileproject.R;
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

        return root;
    }




    // login  method - needs work
    public void login(View view){

        email = (EditText) view.findViewById(R.id.email);
        password = (EditText) view.findViewById(R.id.password);

        String email_field = email.getText().toString();
        String password_field = password.getText().toString();


        // probably need to parse to string in order for it to be able to check users
        User user = recipeDatabase.userDao().getUserByEmail("email");

        if(user != null && user.getPassword().equals(password)){
            // logic
            return;
        }else{
            Toast.makeText(requireActivity(), "Check both fields!", Toast.LENGTH_LONG).show();
        }

        Toast.makeText(requireActivity(), "Welcome to Foody", Toast.LENGTH_SHORT).show();
        // might work need to test more
    }




}
