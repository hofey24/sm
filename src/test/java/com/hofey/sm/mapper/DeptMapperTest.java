package com.hofey.sm.mapper;

import com.hofey.sm.entity.Dept;
import com.hofey.sm.entity.DeptAndEmpDTO;
import com.hofey.sm.entity.EmpAndDeptDto;
import com.hofey.sm.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author: hofey
 * @Date: 2022/2/9 10:57
 * @Description:
 */
@Slf4j
@SpringBootTest
class DeptMapperTest {

    @Autowired
    private SqlSession sqlSession;

    @Test
    void selectDept() {

        DeptMapper deptMapper = this.sqlSession.getMapper(DeptMapper.class);
        Dept dept = deptMapper.selectDept(1);
        System.out.println(dept.toString());
    }

    @Test
    void insertUser() {
        UserMapper userMapper = this.sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("蒙毅");
        user.setMobile("15523452335");
        user.setSex(1);

        int result = userMapper.insertUser(user);
        System.out.println(result);
    }

    @Test
    void selectDeptAndEmps() {
        DeptMapper deptMapper = this.sqlSession.getMapper(DeptMapper.class);
        final List<DeptAndEmpDTO> empAndDeptDtos = deptMapper.selectDeptAndEmp(2);
        System.out.println(empAndDeptDtos.toString());
        List<DeptAndEmpDTO> empAndDeptDto1 =  deptMapper.selectDeptAndEmp(2);
        System.out.println(empAndDeptDto1.toString());
    }


}