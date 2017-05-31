package com.robust.service.impl;

import com.robust.entity.User;
import com.robust.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liubintao on 2017/5/27.
 */
@Service
public class UserService extends BaseService<User> {

    @Autowired
    UserMapper userMapper;

    public int getCount(){
        User user = new User();
        user.setName("4");
        return userMapper.selectCount(user);
    }

    public List<User> getAll(){
        return userMapper.selectAll();
    }
}
