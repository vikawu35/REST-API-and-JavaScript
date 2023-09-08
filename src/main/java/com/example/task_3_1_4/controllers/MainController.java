package com.example.task_3_1_4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/admin")
    public String showAdminPage() {
        return "admin";
    }

    @GetMapping("/user")
    public String userInfo() {
        return "user";
    }

    @GetMapping(value = {"/", "/login"})
    public String showLoginForm() {
        return "login";
    }
}