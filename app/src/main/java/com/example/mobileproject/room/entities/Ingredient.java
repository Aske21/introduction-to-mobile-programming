package com.example.mobileproject.room.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Arrays;

@Entity(tableName = "ingredients")
public class Ingredient {

    @PrimaryKey(autoGenerate = true)
    private long recipe_id;
    private int user_id;
    private String title;
    private String ingredients;
    private String Preparation;
    private Integer rating;

    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    private byte[] image;


    public Ingredient(long recipe_id, int user_id, String title, String ingredients, String preparation, Integer rating, byte[] image) {
        this.recipe_id = recipe_id;
        this.user_id = user_id;
        this.title = title;
        this.ingredients = ingredients;
        Preparation = preparation;
        this.rating = rating;
        this.image = image;
    }

    public Ingredient(){
    }


    // getters

    public long getRecipe_id() {
        return recipe_id;
    }

    public String getTitle() {
        return title;
    }

    public String getIngredients() {
        return ingredients;
    }

    public Integer getRating() {
        return rating;
    }

    public String getPreparation() { return Preparation; }

    public byte[] getImage() { return image; }

    public int getUser_id() {
        return user_id;
    }

    // setters


    public void setRecipe_id(long recipe_id) {
        this.recipe_id = recipe_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public void setPreparation(String preparation) { Preparation = preparation; }

    public void setImage(byte[] image) { this.image = image; }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
// to string


    @Override
    public String toString() {
        return "Ingredient{" +
                "recipe_id=" + recipe_id +
                ", user_id=" + user_id +
                ", title='" + title + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", Preparation='" + Preparation + '\'' +
                ", rating=" + rating +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
