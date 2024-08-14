package com.example.config;

import com.example.controller.UserController;
import com.example.service.UserService;
import com.example.service.UserServiceImpl;

public class AppConfig {
    public UserController createUserController() {
        // Manually injecting UserService into UserController
        UserService userService = new UserServiceImpl();
        return new UserController(userService);
    }
}