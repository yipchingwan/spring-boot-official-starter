package com.oocl.web.sampleWebApp;

public class User {
    private String userName;

    public User() {

    }

    public User(String userName) {
        this.userName = userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
