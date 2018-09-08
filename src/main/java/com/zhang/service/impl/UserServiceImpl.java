package com.zhang.service.impl;

import com.zhang.dao.UserDao;
import com.zhang.model.User;
import com.zhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ZhangRuiyuan
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public User selectUser(String name) {
        return userDao.selectUser(name);
    }
}
