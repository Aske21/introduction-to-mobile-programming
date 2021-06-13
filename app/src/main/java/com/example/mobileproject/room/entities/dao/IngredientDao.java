package com.example.mobileproject.room.entities.dao;

import android.graphics.Bitmap;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.mobileproject.room.entities.Ingredient;

import java.util.List;

@Dao
public interface IngredientDao {


    @Query("INSERT INTO ingredients(image,title,ingredients,Preparation) VALUES(:image, :title, :ingredients, :Preparation)")
    public void create(String title, String ingredients, String Preparation, byte[] image);

    @Update
    public void update(Ingredient ingredient);

    @Query("SELECT * FROM ingredients")
    List<Ingredient> getAll();

    @Query("SELECT * FROM ingredients WHERE rating = 5")
    List<Ingredient> getTopRated();

    @Query("SELECT * FROM ingredients WHERE recipe_id == :id")
    List<Ingredient> getMyRecipes(Long id);
}
