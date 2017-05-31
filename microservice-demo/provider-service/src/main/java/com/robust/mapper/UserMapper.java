package com.robust.mapper;

import com.robust.entity.User;
import com.robust.util.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}