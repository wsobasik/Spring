package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {


    @GetMapping("/hello")
    private String sayHello(String userName, String userAge, Model model) {
        model.addAttribute("userName", userName);
        model.addAttribute("userAge", userAge);
        return "hello";
    }
}
