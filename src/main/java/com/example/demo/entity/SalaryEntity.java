package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "salary",schema = "public")
public class SalaryEntity {
    private Integer id;
    private Long minSalary;
    private Long maxSalary;
    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    @Column(name = "min",nullable = false)
    public Long getMinSalary(){
        return minSalary;
    }
    public void setMinSalary(Long minSalary){
        this.minSalary = minSalary;
    }
    @Column(name = "max",nullable = false)
    public Long getMaxSalary(){
        return maxSalary;
    }
    public void setMaxSalary(Long maxSalary){
        this.maxSalary = maxSalary;
    }
}
