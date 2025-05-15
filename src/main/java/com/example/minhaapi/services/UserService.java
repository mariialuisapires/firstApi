package com.example.minhaapi.services;

import com.example.minhaapi.model.User;
import com.example.minhaapi.repositories.UserRepository;

import java.util.List;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(Long id) {
        return this.userRepository.getUser(id);
    }

    public List<User> getUsers() {
        return this.userRepository.getUsers();
    }

    public User createUser(User user) {
        return this.userRepository.createUser(user);
    }

    public void deleteUser(Long id) {
        this.userRepository.deleteUser(id);
    }
}
