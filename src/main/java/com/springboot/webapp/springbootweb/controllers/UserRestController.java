package com.springboot.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.webapp.springbootweb.models.User;
import com.springboot.webapp.springbootweb.models.dto.UserDto;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details") 
    public UserDto details(){

        UserDto userDto = new UserDto();
        User user = new User("Haitao", "Wu");
        userDto.setUser(user);
        userDto.setTitle("Hola mundo Spring boot");
        return userDto;
    }
    public List<User> list() {
        User user = new User("Zun", "Wu");
        User user2 = new User("Zhen", "Wu");       
        User user3 = new User("Peijiang", "Wu");

        List<User> users = Arrays.asList(user,user2,user3);
        // List<User> users = new ArrayList<User>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);
        return users;
    }

    @GetMapping(path = "/details-map") 
    public Map<String,Object> detailsMap(){
        User user = new User("Haitao", "Wu");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola mundo Spring boot");
        body.put("user", user);
        //asi devuelve un json
        return body;
    }

}
