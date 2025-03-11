package com.example.cicd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("")
public class HelloController {

    @GetMapping("/hello")
    public String index() {
        return "index.html";
    }

}
