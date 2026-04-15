package com.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to AWS DevOps Project 🚀";
    }

    @GetMapping("/health")
    public String health() {
        return "App is running ✅";
    }
}