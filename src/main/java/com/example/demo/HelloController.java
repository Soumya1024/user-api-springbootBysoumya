package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Soumya!";
    }

    @PostMapping("/user")
    public String createUser(@RequestBody User user) {
        return "User " + user.getName() + " with email " + user.getEmail() + " created successfully!";
    }
}
