package com.robust.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by liubintao on 2017/5/27.
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
