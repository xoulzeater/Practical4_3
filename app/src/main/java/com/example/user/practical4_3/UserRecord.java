package com.example.user.practical4_3;

/**
 * Created by User on 6/12/2016.
 */


import com.example.user.practical4_3.UserContract;


public class UserRecord {
    private String name;
    private String email;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString(){
        return UserContract.User.COLUMN_NAME + ":" + this.name +
                "," + UserContract.User.COLUMN_EMAIL + ":" + this.email;
    }
}