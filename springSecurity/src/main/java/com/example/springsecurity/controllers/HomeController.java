package com.example.springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
    @GetMapping("/")
    public String home()
    {
        return "home";
    }

    @GetMapping("/private")
    public String privateArea()
    {
        return "private";
    }
}
