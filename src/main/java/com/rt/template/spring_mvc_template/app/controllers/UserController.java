package com.rt.template.spring_mvc_template.app.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.template.spring_mvc_template.app.dto.UserPostDTO;
import com.rt.template.spring_mvc_template.app.dto.UserResponseDTO;
import com.rt.template.spring_mvc_template.app.models.User;
import com.rt.template.spring_mvc_template.app.services.UserServices;




@RestController
@RequestMapping("/user")
public class UserController {

    private UserServices userServices = new UserServices();
    
    @PostMapping
    public ResponseEntity<UserResponseDTO> register(@RequestBody UserPostDTO userDto) { 
        User user = this.userServices.save(userDto.toObjectUser());
        return new ResponseEntity<>(UserResponseDTO.toDTO(user), HttpStatus.CREATED);
    }
}
