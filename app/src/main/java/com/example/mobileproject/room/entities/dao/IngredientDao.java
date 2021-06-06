package com.example.mobileproject.room.entities.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.mobileproject.room.entities.Ingredient;

@Dao
public interface IngredientDao {

    @Insert
    void insertIngredient(Ingredient ingredient);

    @Update
    public void update(Ingredient ingredient);

    @Query("SELECT * FROM ingredients")
    void getAll();

    @Query("SELECT * FROM ingredients WHERE rating = 5")
    void getTopRated();

}
