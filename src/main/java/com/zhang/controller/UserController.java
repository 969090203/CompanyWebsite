package com.zhang.controller;

import com.zhang.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhangRuiyuan
 */
@Controller
@RequestMapping("user")
public class UserController {

    private UserService userService;


    @RequestMapping("getUser")
    public String getUser(Model User) {
        this.userService = userService;
        return null;
    }
}
