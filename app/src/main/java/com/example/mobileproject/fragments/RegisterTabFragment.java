
package com.example.mobileproject.fragments;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.mobileproject.R;
import com.example.mobileproject.room.entities.RecipeDatabase;
import com.example.mobileproject.room.entities.User;

public class RegisterTabFragment extends Fragment {

    // same thing as the login fragment

    private EditText email;
    private EditText name;
    private EditText surname;
    private EditText password;
    private Button register_btn;


    // db
    private RecipeDatabase recipeDatabase;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.signup_fragment, container, false);

        recipeDatabase = recipeDatabase.getInstance(this.getContext());

        email = (EditText) root.findViewById(R.id.email);
        name = (EditText) root.findViewById(R.id.name);
        surname = (EditText) root.findViewById(R.id.surname);
        password = (EditText) root.findViewById(R.id.password);

        register_btn = root.findViewById(R.id.register_btn);
        register_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                register(v);
            }
        });



        return root;
    }



    // register  method - needs work
    public void register(View view){



        String email_field = email.getText().toString();
        String name_field = name.getText().toString();
        String surname_field = surname.getText().toString();
        String password_field = password.getText().toString();


        // probably need to parse to string in order for it to be able to check users
        User user = recipeDatabase.getInstance(this.getContext()).userDao().getUserByEmail(email_field);



        if(user == null){
            // logic
            recipeDatabase.userDao().add(email_field, name_field, surname_field, password_field);
            System.out.println("success!");

            return;
        }else{
            System.out.println("already exists");
            for(User x:recipeDatabase.userDao().getAllUsers()){
                System.out.println(x.toString());
            }
        }

        Toast.makeText(requireActivity(), "Welcome to Foody", Toast.LENGTH_SHORT).show();
        // might work need to test more
    }


}
