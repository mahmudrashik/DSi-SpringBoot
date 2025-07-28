package com.example.intern_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.intern_demo.model.AppUser;
import com.example.intern_demo.repository.AppUserRepository;

@RestController
@RequestMapping("/users")
public class HelloController {

    @Autowired
    private AppUserRepository appUserRepository;

    @GetMapping
    public List<AppUser> getAllUsers() {
        return appUserRepository.findAll();
    }

    @PostMapping
    public AppUser createUser(@RequestBody AppUser user) {
        return appUserRepository.save(user);
    }
}
