package com.zhang.service;

import com.zhang.dao.UserDao;
import com.zhang.model.User;
import org.springframework.stereotype.Service;

/**
 * @author ZhangRuiyuan
 */
@Service
public interface UserService {

    /**
     * @param name
     * @return
     */
    User selectUser(String name);
}
