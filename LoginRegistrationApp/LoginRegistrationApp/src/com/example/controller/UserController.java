package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;

public class UserController {
    private UserService userService;

    // Constructor Injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public boolean register(User user) {
        return userService.register(user);
    }

    public boolean login(String username, String password) {
        return userService.login(username, password);
    }
}