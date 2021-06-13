package com.example.mobileproject.room.entities;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.mobileproject.Converters.ImageConverter;
import com.example.mobileproject.room.entities.dao.ImageDao;
import com.example.mobileproject.room.entities.dao.IngredientDao;
import com.example.mobileproject.room.entities.dao.UserDao;

@Database(
        version = 1,
        entities = {User.class, Ingredient.class,Image.class}

)
@TypeConverters(ImageConverter.class)
public abstract class RecipeDatabase extends RoomDatabase {
    public abstract ImageDao imageDao();
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