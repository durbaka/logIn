package com.example.logIn.controller;

import com.example.logIn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.logIn.services.UserService;

import java.util.List;

@RestController
public class UserLogInController {

    @Autowired
    UserService userService;


    @GetMapping("/usersList")
    private List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    private int saveUser(@RequestBody User user) {
        userService.saveOrUpdate(user);
        return user.getId();
    }
}
