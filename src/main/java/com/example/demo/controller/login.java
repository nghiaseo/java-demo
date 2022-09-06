package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("login")
public class login {
    @Autowired
    private UserRepository userRepo;

    @GetMapping("/")
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
    @PostMapping("/")
    public User createUser(@Validated @RequestBody User user){
        return userRepo.save(user);
    }

}
