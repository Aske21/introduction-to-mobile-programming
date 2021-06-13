package com.example.mobileproject.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mobileproject.Converters.ImageConverter;
import com.example.mobileproject.R;
import com.example.mobileproject.room.entities.Ingredient;
import com.example.mobileproject.room.entities.dao.IngredientDao;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {
    private Context context;
    private List<Ingredient> ingredientList;

    public ListViewAdapter(Context context, List<Ingredient> ingredientList) {
        this.context = context;
        this.ingredientList = ingredientList;
    }

    @Override
    public int getCount() {
        return ingredientList.size();
    }

    @Override
    public Object getItem(int position) {
        return ingredientList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ingredientList.get(position).getRecipe_id();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.list_row, parent, false);
        Ingredient ingredient = ingredientList.get(position);
        TextView itemTitle = convertView.findViewById(R.id.RecipeName);
        TextView itemBody = convertView.findViewById(R.id.ShortDescription);
        ImageView imageView = convertView.findViewById(R.id.imageInListView);
        itemTitle.setText(ingredient.getTitle());
        itemBody.setText(ingredient.getIngredients());
        imageView.setImageBitmap(ImageConverter.convertByteArray2Image(ingredient.getImage()));
        return convertView;
    }
}
