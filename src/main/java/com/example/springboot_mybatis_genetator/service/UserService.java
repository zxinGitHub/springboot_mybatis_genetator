package com.example.springboot_mybatis_genetator.service;

import com.example.springboot_mybatis_genetator.model.User;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

/**
 * Created by zhangxin on 2017/11/28.
 */
public interface UserService {

    PageList<User> findUserList(PageBounds pageBounds);

}
