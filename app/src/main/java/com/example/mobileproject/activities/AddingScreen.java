package com.example.mobileproject.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobileproject.Converters.ImageConverter;
import com.example.mobileproject.R;
import com.example.mobileproject.room.entities.Ingredient;
import com.example.mobileproject.room.entities.RecipeDatabase;
import com.example.mobileproject.room.entities.dao.IngredientDao;

import java.io.FileDescriptor;
import java.io.IOException;
import java.util.ArrayList;

public class AddingScreen extends AppCompatActivity {

    ImageView imageView;
    Bitmap bmpImage;
    Uri imageUri;
    private static final int PICK_IMAGE=1;
    EditText Title, Ingredients, Description;
    private RecipeDatabase recipeDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adding_screen);

        imageView = findViewById(R.id.AddPictureDish);

        Title = findViewById(R.id.DishTitle);
        Ingredients = findViewById(R.id.ingredients);
        Description = findViewById(R.id.description);
        recipeDatabase = recipeDatabase.getInstance(this.getApplicationContext());
    }


    public void AddDishImage(View view) {
        Intent gallery = new Intent();
        gallery.setType("image/*");
        gallery.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(gallery, "Select Picture"), PICK_IMAGE);
        }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == PICK_IMAGE && resultCode == RESULT_OK){
            imageUri = data.getData();
            try{
                bmpImage = MediaStore.Images.Media.getBitmap(getContentResolver(), imageUri);
                imageView.setImageBitmap(bmpImage);
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public void FinishAdding(View view) {
        if(Title.getText().toString().isEmpty() || Ingredients.getText().toString().isEmpty() || Description.getText().toString().isEmpty() || bmpImage == null){
            Toast.makeText(
                    this,
                    "Data is missing",
                    Toast.LENGTH_SHORT
            ).show();
        }
        else{
            Ingredient ingredient = new Ingredient();
            ingredient.setTitle(Title.getText().toString());
            ingredient.setIngredients(Ingredients.getText().toString());
            ingredient.setPreparation(Description.getText().toString());
            byte[] imagebytes = ImageConverter.convertImage2ByteArray(bmpImage);
            ingredient.setImage(imagebytes);
            String title_field = Title.getText().toString();
            String ingredients_field = Ingredients.getText().toString();
            String description_field = Description.getText().toString();
            recipeDatabase.ingredientDao().create(title_field, ingredients_field, description_field, imagebytes);
            finish();
        }
    }
}
