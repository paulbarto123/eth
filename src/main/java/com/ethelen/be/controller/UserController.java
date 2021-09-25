package com.ethelen.be.controller;

import com.ethelen.be.entity.User;
import com.ethelen.be.repository.UserRepository;
import com.ethelen.be.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/user/login")
    public User loginUser(@RequestBody User user){
        return userService.userLogin(user);
    }
}
