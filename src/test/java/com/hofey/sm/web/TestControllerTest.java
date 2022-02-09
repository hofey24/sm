package com.hofey.sm.web;

import com.hofey.sm.entity.User;
import com.hofey.sm.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: hofey
 * @Date: 2022/2/9 11:17
 * @Description:
 */
class TestControllerTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void selectUser() {

        User user = userMapper.selectUser(1);
        System.out.println(user.toString());
    }
}