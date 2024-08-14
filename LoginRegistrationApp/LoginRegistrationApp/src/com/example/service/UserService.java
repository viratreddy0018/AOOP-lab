package com.example.service;

import com.example.model.User;

public interface UserService {
    boolean register(User user);
    boolean login(String username, String password);
}