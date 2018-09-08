package com.zhang.dao;

import com.zhang.model.User;

/**
 * @author ZhangRuiyuan
 */
public interface UserDao {

    /**
     * data by name
     * @param name
     * @return User
     */
    User selectUser(String name);
}
