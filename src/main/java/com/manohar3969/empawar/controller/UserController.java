package com.manohar3969.empawar.controller;

import com.manohar3969.empawar.dto.AuthRequest;
import com.manohar3969.empawar.dto.AuthResponse;
import com.manohar3969.empawar.model.User;
import com.manohar3969.empawar.repository.UserRepository;
import com.manohar3969.empawar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User createProduct(@RequestBody User user) {
        return userService.createProduct(user);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest authRequest) {
        if(authRequest.getUsername() == null)
        {
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User Name is Null");
        } else {
            Optional<User> userOpt = userRepository.findByUserEmailID(authRequest.getUsername());

            if (userOpt.isPresent() && userOpt.get().getUserPassword().equals(authRequest.getPassword())) {
                // You would generate a JWT token here and return it
                return ResponseEntity.ok(new AuthResponse("1a2b3c4d", "Login Successful"));
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
            }
        }
    }

}
