package com.springboot.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springboot.webapp.springbootweb.models.User;


@Controller
public class UserController {

    @GetMapping("/details") 
    public String details(Model model){

        User user = new User("Haitao", "Wu");

        model.addAttribute("title", "Hola mundo Spring boot");
        model.addAttribute("user",user);

        return "details";
    }

    @GetMapping("/list")
    public String list(Model model) {
    //    List<User> users = Arrays.asList(new User("Haitao", "Wu", "haitao@correo.com"),
    //                                     new User("Marta", "Gonzalez","marta@correo.com"),
    //                                     new User("Andrés", "Dow"));            
       
    //    model.addAttribute("users", users);
       model.addAttribute("tittle", "Listado de usuarios!");
                   
       return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel(){
        List<User> users = Arrays.asList(new User("Haitao", "Wu", "haitao@correo.com"),
                                        new User("Marta", "Gonzalez","marta@correo.com"),
                                        new User("Andrés", "Dow"));
        return users;
    }
    

}
