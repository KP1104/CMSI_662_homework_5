package com.project;

/*
* This is just a model class which is used
* for getting and setting the values which
* we get from the front end html
*/
public class User {

    public String username;
    public String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
