package com.example.HashingSalting.controller;

import com.example.HashingSalting.model.User;

import com.example.HashingSalting.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/users")
    public @ResponseBody List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
