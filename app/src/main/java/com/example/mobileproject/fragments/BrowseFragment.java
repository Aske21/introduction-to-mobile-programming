package com.example.mobileproject.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.mobileproject.R;
import com.example.mobileproject.adapters.ListViewAdapter;
import com.example.mobileproject.room.entities.Ingredient;
import com.example.mobileproject.room.entities.RecipeDatabase;

import java.util.List;

public class BrowseFragment extends Fragment {
    private ListView listView;

    public BrowseFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_browse, container, false);
        listView = view.findViewById(R.id.ListViewBrowse);
        return view;

    }

    private void setUpListAdapter(){
        List<Ingredient> ingredients = RecipeDatabase.getInstance(getContext()).ingredientDao().getAll();
        ListViewAdapter adapter = new ListViewAdapter(this.getContext(), ingredients);
        listView.setAdapter(adapter);
    }

    private void getAllRecipes(){
        List<Ingredient> ingredients = RecipeDatabase.getInstance(this.getContext()).ingredientDao().getAll();
        System.out.println("working");
    }
}