package com.zhang.controller;

import com.zhang.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ZhangRuiyuan
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/getUser")
    public String getUser(@RequestParam("name") String name) {
        System.out.print(name);
        System.out.print(userService.selectUser(name).toString());
        return userService.selectUser(name).toString();
    }
}
