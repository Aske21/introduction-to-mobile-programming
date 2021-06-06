package com.example.mobileproject.room.entities.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.mobileproject.room.entities.User;

import java.util.List;

@Dao
public interface UserDao {

    @Insert
    void add(User user);

    @Query("SELECT * FROM users WHERE name = :username LIMIT 1")
    User getByName(String username);

    @Query("SELECT * FROM users WHERE email = :email LIMIT 1")
    User getUserByEmail(String email);

    @Query("SELECT * FROM users WHERE id = :id")
    User getUserById(Long id);

    @Query("SELECT * FROM users")
    List<User> getAllUsers();

    @Update
    void update(User user);
}
