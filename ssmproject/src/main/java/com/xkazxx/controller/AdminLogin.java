package com.xkazxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminLogin {
    @RequestMapping("/login")
    public String adminLogin(){
        return "login";
    }
}
