package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "user",schema = "public")
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer dep;
    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    @Column(name = "username",nullable = false)
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    @Column(name = "password")
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    @Column(name = "dep")
    public Integer getDep(){
        return dep;
    }
    public void setDep(Integer dep){
        this.dep = dep;
    }


}
