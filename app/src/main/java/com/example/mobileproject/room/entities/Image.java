package com.example.mobileproject.room.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity(tableName = "Image")
public class Image {

        @PrimaryKey
        @ColumnInfo(name = "image_id")
        private int id;

        @ColumnInfo(name = "imageList")
        private ArrayList<String> image;

}
