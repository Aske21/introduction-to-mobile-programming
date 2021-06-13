package com.example.mobileproject.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.mobileproject.R;
import com.example.mobileproject.adapters.CurrentUser;
import com.example.mobileproject.adapters.ListViewAdapter;
import com.example.mobileproject.room.entities.Ingredient;
import com.example.mobileproject.room.entities.RecipeDatabase;

import java.util.List;

public class HomeFragment extends Fragment {

    private ListView listView;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        this.listView = (ListView) view.findViewById(R.id.ListViewHome);
        setUpListAdapter(RecipeDatabase.getInstance(getContext()).ingredientDao().getMyRecipes(CurrentUser.getCurrentUser().getUser().getId()));
        return view;
    }

    private void setUpListAdapter(List<Ingredient> ingredients) {
        ListViewAdapter adapter = new ListViewAdapter(getContext(), ingredients);
        this.listView.setAdapter(adapter);
    }
}