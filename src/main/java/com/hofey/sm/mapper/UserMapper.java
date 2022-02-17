package com.hofey.sm.mapper;

import com.hofey.sm.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author: hofey
 * @Date: 2022/2/8 17:37
 * @Description: userMapper
 */
@Repository
public interface UserMapper {


    /**
     * 查询单个用户
     * @Author: hofey
     * @Date: 2022/2/16 20:47
     * @param id
     * @return
     */
    User selectUser(int id);

    /**
     * 插入用户信息并返回用户ID
     * @Author: hofey
     * @Date: 2022/2/16 20:48
     * @param
     * @return
     */
    int insertUser(User user);



}
