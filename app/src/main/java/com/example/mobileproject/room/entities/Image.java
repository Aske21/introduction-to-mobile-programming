package com.example.mobileproject.room.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

public class Image {
    @Entity(tableName = "Image")
    public class Test{

        @PrimaryKey
        @ColumnInfo(name = "image_id")
        private int id;

        @ColumnInfo(name = "imageList")
        private ArrayList<String> image;
    }
}
