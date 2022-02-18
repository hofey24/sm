package com.hofey.sm.mapper;

import com.hofey.sm.entity.EmpAndDeptDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: hofey
 * @Date: 2022/2/18 17:21
 * @Description:
 */
@Slf4j
@SpringBootTest
class EmpMapperTest {

    @Autowired
    private SqlSession sqlSession;
    @Test
    void selectEmpAndDept() {
        EmpMapper empMapper = this.sqlSession.getMapper(EmpMapper.class);

        final List<EmpAndDeptDto> empAndDeptDtos = empMapper.selectEmpAndDept();

        for (EmpAndDeptDto empAndDeptDto : empAndDeptDtos
        ) {
            log.info(empAndDeptDto.toString());
        }
    }
}