package com.rt.template.spring_mvc_template.app.dto;

import com.rt.template.spring_mvc_template.app.models.User;


public class UserPostDTO {

    private String name;
    private String email;
    private String password;

    public User toObjectUser() {
        return new User(this.name, this.email, this.password);
    }
}
