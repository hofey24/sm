package com.hofey.sm.mapper;

import com.hofey.sm.entity.Dept;
import com.hofey.sm.entity.DeptAndEmpDTO;
import com.hofey.sm.entity.EmpAndDeptDto;
import com.hofey.sm.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: hofey
 * @Date: 2022/2/8 17:37
 * @Description: DeptMapper
 */
@Repository
public interface DeptMapper {


    /**
     * 查询单个部门
     * @Author: hofey
     * @Date: 2022/2/16 20:47
     * @param id
     * @return
     */
    Dept selectDept(int id);


    /**
     * 查询部门下员工信息
     * @Author: hofey
     * @Date: 2022/2/18 13:43
     * @param
     * @return
     */
    List<DeptAndEmpDTO> selectDeptAndEmp(int id);


}
