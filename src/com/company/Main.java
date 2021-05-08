package com.company;

import business.abstracts.UserService;
import business.concretes.UserManager;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.EaUserDao;
import entities.concretes.User;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserManager(new EaUserDao());
        User user = new User(1,"esra","aras","esraras@gmail.com",123456);
        userService.add(user);
    }
}
