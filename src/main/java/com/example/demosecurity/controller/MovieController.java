package com.example.demosecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @GetMapping("public")
//    @Secured("ROLE_USER")
    public String publiclyAvailable() {
        return "Hello All";
    }

    @GetMapping("admin")
//    @Secured("ROLE_ADMIN")
    public String adminAccessible() {
        return "Hello Admin!";
    }
}
