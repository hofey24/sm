package com.hofey.sm.mapper;

import com.hofey.sm.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: hofey
 * @Date: 2022/2/9 10:57
 * @Description:
 */
@SpringBootTest
class UserMapperTest {

    @Autowired
    private SqlSession sqlSession;
    @Test
    void selectUser() {

        UserMapper userMapper = this.sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUser(1);
        System.out.println(user.toString());
    }

    @Test
    void insertUser(){
        UserMapper userMapper = this.sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("蒙毅");
        user.setMobile("15523452335");
        user.setSex(1);

        int result = userMapper.insertUser(user);
        System.out.println(result);
    }
}