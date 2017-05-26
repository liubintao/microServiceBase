package com.robust.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liubintao on 2017/5/25.
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "hello world";
    }
}
