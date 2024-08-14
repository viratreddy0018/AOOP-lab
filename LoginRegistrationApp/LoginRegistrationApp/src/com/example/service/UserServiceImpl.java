package com.example.service;

import com.example.model.User;
import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private Map<String, String> users = new HashMap<>();

    @Override
    public boolean register(User user) {
        if (users.containsKey(user.getUsername())) {
            return false; // User already exists
        }
        users.put(user.getUsername(), user.getPassword());
        return true;
    }

    @Override
    public boolean login(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}