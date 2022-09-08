package com.example.demo.controller;

import com.example.demo.entity.SalaryEntity;
import com.example.demo.repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salary")
public class SalaryController {
    @Autowired
    private SalaryRepository salaryRepo;
    @GetMapping("")
    public List<SalaryEntity> getAllSalary(){
        return salaryRepo.findAll();
    }
    @PostMapping("")
    public SalaryEntity createSalary(SalaryEntity salary){
        return salaryRepo.save(salary);
    }
}
