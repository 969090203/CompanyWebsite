package com.zhang.service.impl;

import com.zhang.dao.UserDao;
import com.zhang.model.User;
import com.zhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ZhangRuiyuan
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User selectUser(String name) {
        return userDao.selectUser(name);
    }
}
