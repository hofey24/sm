package com.hofey.sm.mapper;

import com.hofey.sm.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * @Author: hofey
 * @Date: 2022/2/9 10:57
 * @Description:
 */
class UserMapperTest {

    private SqlSession sqlSession;
    @Test
    void selectUser() {

        UserMapper userMapper = this.sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUser(1);
        System.out.println(user.toString());
    }
}