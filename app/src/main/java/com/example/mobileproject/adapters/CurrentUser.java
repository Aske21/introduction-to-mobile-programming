package com.example.mobileproject.adapters;

import com.example.mobileproject.room.entities.User;

public class CurrentUser {

    private static CurrentUser INSTANCE = null;
    private User user = null;


    public static CurrentUser getCurrentUser(){
        if(INSTANCE == null){
            INSTANCE = new CurrentUser();
        }
        return INSTANCE;

    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public void deleteUser() {
        this.user = null;
    }

}
