package com.rt.template.spring_mvc_template.app.models;


import java.util.HashMap;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String email;
    private String password;
    private boolean admin = false;

    public User() {}

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return this.admin;
    }

    public void setAdmin(int permissionKey) {
        if (permissionKey != name.length()) return;
        this.admin = true;
    }

    public HashMap<String, String> toHashMap() {
        HashMap<String, String> userHashMap = new HashMap<>();
        userHashMap.put("name", this.name);
        userHashMap.put("email", this.email);
        userHashMap.put("password", this.password);
        return userHashMap;
    }
}
