package com.example.springboot_mybatis_genetator;

import com.example.springboot_mybatis_genetator.model.User;
import com.example.springboot_mybatis_genetator.service.UserService;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhangxin on 2017/11/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserController {

    @Autowired
    private UserService userService;

    @Test
    public void findUserList(){
        PageBounds pageBounds = new PageBounds();
        pageBounds.setLimit(10);
        PageList<User> list = userService.findUserList(pageBounds);
        System.out.println("Limit********:"+list.getPaginator().getLimit());
        System.out.println("TotalCount********:"+list.getPaginator().getTotalCount());
        System.out.println(list);
    }
}
