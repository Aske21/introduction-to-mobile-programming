package com.example.mobileproject.room.entities;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.mobileproject.room.entities.dao.IngredientDao;
import com.example.mobileproject.room.entities.dao.UserDao;

@Database(
        version = 1,
        entities = {User.class, Ingredient.class}

)
public abstract class RecipeDatabase extends RoomDatabase {

    public abstract UserDao userDao();
    public abstract IngredientDao ingredientDao();
    private static RecipeDatabase INSTANCE;

    public static RecipeDatabase getInstance(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context, RecipeDatabase.class, "recipe_database").allowMainThreadQueries().build();
        }
        return INSTANCE;
    }
}