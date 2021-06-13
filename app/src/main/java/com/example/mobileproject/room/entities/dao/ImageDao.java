package com.example.mobileproject.room.entities.dao;

import androidx.room.Insert;
import androidx.room.Query;

import com.example.mobileproject.room.entities.Image;

import java.util.List;

public interface ImageDao {

    @Insert
    void insert(Image... images);

    @Query("SELECT * FROM Image")
    List<Image> getAllImage();

    @Query("SELECT * FROM Image where image_id = :imageId")
    List<Image> getImageByImageId(int imageId);

}
