package com.hofey.sm.service.impl;

import com.hofey.sm.entity.User;
import com.hofey.sm.mapper.UserMapper;
import com.hofey.sm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: hofey
 * @Date: 2022/2/9 13:59
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Integer id) {
        return userMapper.selectUser(id);
    }
}
