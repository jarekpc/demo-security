package com.example.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @GetMapping("/home")
//    @Secured("ROLE_USER")
    public String home(Model model, Principal principal) {
        if (principal != null) {
            model.addAttribute("msg", "Witaj " + principal.getName());
        }
        return "home";
    }

    @GetMapping("/protected")
//    @Secured("ROLE_ADMIN")
    public String protect_Page() {
        return "protected";
    }
}
