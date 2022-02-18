package com.hofey.sm.mapper;

import com.hofey.sm.entity.Dept;
import com.hofey.sm.entity.Emp;
import com.hofey.sm.entity.EmpAndDeptDto;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: hofey
 * @Date: 2022/2/8 17:37
 * @Description: DeptMapper
 */
@Repository
public interface EmpMapper {



    List<EmpAndDeptDto> selectEmpAndDept();



}
