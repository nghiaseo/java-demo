package com.example.demo.controller;

import com.example.demo.repository.DepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dep")
public class Department {
    @Autowired
    private DepRepository depRepo;
    @GetMapping("")
    public List<com.example.demo.entity.Department> getAllDep(){
        return depRepo.findAll();
    }
    @PostMapping("")
    public com.example.demo.entity.Department createDep(@Validated @RequestBody com.example.demo.entity.Department dep){
        return depRepo.save(dep);
    }
}
