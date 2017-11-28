package com.example.springboot_mybatis_genetator.mapper;

import com.example.springboot_mybatis_genetator.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends CustomMapper<User> {
}