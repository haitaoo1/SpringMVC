package com.springboot.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.webapp.springbootweb.models.User;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api/var")
public class PathVariableController { 

    @PostMapping("/create")
    public User create(@RequestBody User user){
        //hacer algo con  el usuario en la bbdd
        user.setName(user.getName().toUpperCase());
        return user;
    }
    
    
}
