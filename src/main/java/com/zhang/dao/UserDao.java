package com.zhang.dao;

import com.zhang.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author ZhangRuiyuan
 */
@Repository
public interface UserDao {

    /**
     * data by name
     * @param name
     * @return User
     */
    User selectUser(String name);
}
