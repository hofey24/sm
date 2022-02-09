package com.hofey.sm.web;

import com.hofey.sm.entity.User;
import com.hofey.sm.mapper.UserMapper;
import com.hofey.sm.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class TestControllerTest {

    @Autowired
    private UserService userService;

    @Test
    void selectUser() {

        User user = userService.getUser(1);
        System.out.println(user.toString());
    }
}