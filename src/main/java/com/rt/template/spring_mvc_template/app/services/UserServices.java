package com.rt.template.spring_mvc_template.app.services;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.template.spring_mvc_template.app.models.User;
import com.rt.template.spring_mvc_template.app.repository.UserRepository;


@Service
public class UserServices {
    
    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public java.util.List<User> listUsers() {
        return userRepository.findAll();
    }

    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }

    public Long count() {
        return userRepository.count();
    }

    public void delete(String id) {
        userRepository.deleteById(id);
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }
}
