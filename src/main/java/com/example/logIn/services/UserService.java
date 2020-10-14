package com.example.logIn.services;

import com.example.logIn.entity.User;
import com.example.logIn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<User>();
        userRepository.findAll().forEach(userList::add);
        return userList;
    }

    public void saveOrUpdate(User user) {
        userRepository.save(user);
    }
}
