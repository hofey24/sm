package com.hofey.sm.entity;

import lombok.Data;

import java.util.List;

/**
 * @Author: hofey
 * @Date: 2022/2/18 17:17
 * @Description:
 */
@Data
public class DeptAndEmpDTO {
    private Integer id;
    private String name;

    private List<Emp> emps;
}
