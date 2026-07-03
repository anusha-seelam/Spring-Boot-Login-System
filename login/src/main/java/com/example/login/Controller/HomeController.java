package com.example.login.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String login() {
        return "home";
    }


    
    @GetMapping("/home")
    public String home() {
        return "home";
    }

}