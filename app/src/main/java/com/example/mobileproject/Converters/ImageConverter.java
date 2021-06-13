package com.example.mobileproject.Converters;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.room.TypeConverter;


import java.io.ByteArrayOutputStream;
import java.io.OutputStream;


public class ImageConverter {
    public static byte[] convertImage2ByteArray(Bitmap bitmap){
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 0, stream);
        return stream.toByteArray();
    }

    public static Bitmap convertByteArray2Image(byte [] array){
        return BitmapFactory.decodeByteArray(array, 0, array.length);
    }

}
