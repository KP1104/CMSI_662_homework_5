package com.project.entity;

import jakarta.persistence.*;

/*
* Creating an entity class which is a must approach for spring mvc model
* Here entity refers to annotation where table annotation is used for admin
*/
@Entity
@Table(name = "admin")
public class Admin {

    /*
    * Id annotation is used to denote primary key
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    private String userName;

    private String password;



    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
