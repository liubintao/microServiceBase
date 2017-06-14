package com.robust.controller;

import com.robust.entity.User;
import com.robust.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

  @Autowired
  private UserService userService;

  @GetMapping(value = "/user/{id}")
  public User findById(@PathVariable Long id){
    return userService.findById(id);
  };

  @GetMapping("/list")
  public List<User> list(){
    return userService.list();
  }
}
