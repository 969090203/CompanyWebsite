package com.zhang.service;

import com.zhang.model.User;
import org.springframework.stereotype.Service;

/**
 * @author ZhangRuiyuan
 */
@Service
public interface UserService {

    /**
     * @param name
     */
    User selectUser(String name);
}
