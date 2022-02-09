package com.hofey.sm.web;

import com.hofey.sm.entity.User;
import com.hofey.sm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hofey
 * @Date: 2022/2/9 11:13
 * @Description:
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("/selectUser")
    public String selectUser(){

        User user = userService.getUser(1);
        System.out.println(user.toString());
        return "select success == SpringBoot 2.X整合Mybatis成功！";
    }

}
