package com.rt.template.spring_mvc_template.app.dto;

import com.rt.template.spring_mvc_template.app.models.User;


public class UserResponseDTO {
    
    private Long id;
    private String name;
    private String email;
    private boolean admin;

    public UserResponseDTO(Long id, String name, String email, boolean admin) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.admin = admin;
    }
    
    public static UserResponseDTO toDTO(User user) {
        return new UserResponseDTO(user.getId(), user.getName(), user.getEmail(), user.isAdmin());
    }
}
