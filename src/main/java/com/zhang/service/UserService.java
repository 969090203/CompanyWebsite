package com.zhang.service;

import com.zhang.model.User;

/**
 * @author ZhangRuiyuan
 */
public interface UserService {

    /**
     * @param name
     * @return
     */
    User selectUser(String name);
}
