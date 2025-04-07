package com.manohar3969.empawar.service;

import com.manohar3969.empawar.model.User;
import com.manohar3969.empawar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createProduct(User user) {
        return userRepository.save(user);
    }
}
