package com.example.demo;

import org.springframework.stereotype.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class LoginController {

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/hello")
    public String sayhello() {
        return "hello mvn";
    }
}
