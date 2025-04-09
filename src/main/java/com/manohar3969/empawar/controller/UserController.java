package com.manohar3969.empawar.controller;

import com.manohar3969.empawar.model.User;
import com.manohar3969.empawar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User createProduct(@RequestBody User user) {
        return userService.createProduct(user);
    }

}
