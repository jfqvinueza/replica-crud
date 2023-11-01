package com.inicio.jimmy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inicio.jimmy.model.User;
import com.inicio.jimmy.service.UserService;

@RestController
@RequestMapping("api/admin")
@CrossOrigin({ "*" })

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User save(@RequestBody User entity) {
        return userService.save(entity);
    }

    @GetMapping("/{id}/")
    public User findById(@PathVariable long id) {
        return userService.fingById(id);
    }
}
