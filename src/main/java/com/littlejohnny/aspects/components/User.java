package com.littlejohnny.aspects.components;

import org.springframework.stereotype.Component;

public class User implements IUser{
    private String name;

    @Override
    public void logIn() {
        System.out.println(name + " logging in");
    }

    @Override
    public void logOut() {
        System.out.println(name + " logging out");
    }

    @Override
    public String doWork(String text) {
        return text.toLowerCase();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
}
