package com.example.demo.entity;

import io.swagger.models.auth.In;

import javax.persistence.*;

@Entity
@Table(name = "department", schema = "public")
public class Department {
    private Integer id;
    private String depName;
    private Integer salary;
    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId(){ return id; }
    public void setId(Integer id){ this.id = id; }
    @Column(name = "depname",nullable = false)
    public String getDepName(){ return depName;}

    public void setDepName(String depName) {
        this.depName = depName;
    }
    @Column(name = "salary")
    public Integer getSalary(){
        return salary;
    }
    public void setSalary(Integer salary){
        this.salary = salary;
    }
}
