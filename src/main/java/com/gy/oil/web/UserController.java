package com.gy.oil.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gy.oil.entity.User;
import com.gy.oil.service.UserService;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    
    @RequestMapping("/test")
    @ResponseBody
    public List<User> testUser() {
        return userService.testUser();
    }
}
