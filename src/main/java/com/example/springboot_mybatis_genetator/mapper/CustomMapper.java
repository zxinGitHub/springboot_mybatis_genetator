package com.example.springboot_mybatis_genetator.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by zhangxin on 2017/11/22.
 */
public interface CustomMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
