package com.zhang.service;

import com.zhang.dao.UserDao;
import com.zhang.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Resource
    private UserDao userDao;

    @Test
    public void selectUserTest(){
        User user = userService.selectUser("张芮源");
       System.out.print(user.toString());
    }

    @Test
    public void selectUserDaoTest(){
        User user = userDao.selectUser("张芮源");
        System.out.print(user.toString());
    }
}
