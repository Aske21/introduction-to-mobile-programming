package com.example.mobileproject.adapters;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mobileproject.R;
import com.example.mobileproject.activities.ListViewHolder;
import com.example.mobileproject.activities.Recipe;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends BaseAdapter {
    public ArrayList<Recipe> listRecipes;
    private Context context;

    public ListViewAdapter(Context context, ArrayList<Recipe> listRecipes){
        this.context = context;
        this.listRecipes = listRecipes;
    }

    @Override
    public int getCount() {
        return listRecipes.size();
    }

    @Override
    public Recipe getItem(int position) {
        return listRecipes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View row;
        final ListViewHolder listViewHolder;
        if(convertView == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.list_row,parent,false);
            listViewHolder = new ListViewHolder();
            listViewHolder.Name
        }
        return null;
    }
}
