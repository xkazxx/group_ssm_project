package com.xkazxx.controller;

import com.xkazxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login(String username, String password, Model model){

        boolean user = userService.queryUserById(username, password);
        if(user) {
            model.addAttribute("username", username);
            return "hello";
        }
        else return "login";
    }

    UserController(){
        System.out.println("init");
    }

}
