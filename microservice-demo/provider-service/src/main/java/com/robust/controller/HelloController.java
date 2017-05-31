package com.robust.controller;

import com.robust.entity.User;
import com.robust.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by liubintao on 2017/5/25.
 */
@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/count")
    public int count(){
        return userService.getCount();
    }

    @GetMapping("/list")
    public List<User> list(){
        return userService.selectAll();
    }
}
