package com.shaheen.demo.controller;

import com.shaheen.demo.model.User;
import com.shaheen.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> getALl(){
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Integer id){
        return new User();
    }
}
