package com.example.mobileproject.room.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "ingredients")
public class Ingredient {

    @PrimaryKey(autoGenerate = true)
    private long recipe_id;
    private String title;
    private String ingredients;
    private String Preparation;
    private Integer rating;
    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    private byte[] image;


    public Ingredient(long recipe_id, String title, String ingredients, String preparation, Integer rating, byte[] image) {
        this.recipe_id = recipe_id;
        this.title = title;
        this.ingredients = ingredients;
        this.Preparation = preparation;
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
    // to string


    @Override
    public String toString() {
        return "Ingredient{" +
                "recipe_id=" + recipe_id +
                ", title='" + title + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", rating=" + rating +
                '}';
    }
}
