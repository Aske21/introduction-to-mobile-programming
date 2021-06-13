package com.example.mobileproject.fragments;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mobileproject.DetailedView;
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
        this.listView = (ListView) view.findViewById(R.id.ListViewBrowse);
        setUpListAdapter(RecipeDatabase.getInstance(getContext()).ingredientDao().getAll());
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
    });
        return view;
    }

    private void setUpListAdapter(List<Ingredient> ingredients) {
        ListViewAdapter adapter = new ListViewAdapter(getContext(), ingredients);
        this.listView.setAdapter(adapter);
    }
}