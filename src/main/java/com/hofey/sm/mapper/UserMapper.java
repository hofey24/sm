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


    User selectUser(int id);


}
