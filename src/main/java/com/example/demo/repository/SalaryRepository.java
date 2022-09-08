package com.example.demo.repository;

import com.example.demo.entity.SalaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<SalaryEntity,Integer> {
}
