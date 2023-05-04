package com.rt.template.spring_mvc_template.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rt.template.spring_mvc_template.app.models.User;


public interface UserRepository extends JpaRepository<User, String> {}
