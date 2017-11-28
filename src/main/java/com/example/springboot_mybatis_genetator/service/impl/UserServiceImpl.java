package com.example.springboot_mybatis_genetator.service.impl;

import com.example.springboot_mybatis_genetator.mapper.UserMapper;
import com.example.springboot_mybatis_genetator.model.User;
import com.example.springboot_mybatis_genetator.service.UserService;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangxin on 2017/11/28.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageList<User> findUserList(PageBounds pageBounds) {
        List<User> list = userMapper.selectByExampleAndRowBounds(null,pageBounds);
        PageList<User> pageList = (PageList<User>) list;
        return pageList;
    }
}
