package com.robst.service;

import com.robst.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liubintao on 2017/6/13.
 */
@FeignClient(name = "provider-service", fallback = UserFeignClientFallback.class)
public interface UserService {

    @GetMapping(value = "/user/{id}")
    User findById(@PathVariable("id") Long id);

    @GetMapping("/list")
    List<User> list();
}

@Component
class UserFeignClientFallback implements UserService {
    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(-1L);
        user.setUsername("默认用户");
        return user;
    }

    @Override
    public List<User> list() {
        return new ArrayList<>();
    }
}
