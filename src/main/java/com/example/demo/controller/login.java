package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.DepRepository;
import com.example.demo.repository.SalaryRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("login")
public class login {
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private DepRepository depRepository;
    @Autowired
    private SalaryRepository salaryRepository;

    @GetMapping("")
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable("id")int id){
        return userRepo.findById(id);
    }
    @GetMapping("/{id}/salary")
    public Long getMinSalary(@PathVariable("id")int id){
        var depId = userRepo.findById(id).get().getDep();
        var salary = depRepository.findById(depId).get().getSalary();
        var min = salaryRepository.findById(salary).get().getMinSalary();
        return min;
    }
    @PostMapping("")
    public User createUser(@Validated @RequestBody User user){
        return userRepo.save(user);
    }
    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") int id,@RequestBody User user){
        userRepo.save(user);
        return user;
    }

}
