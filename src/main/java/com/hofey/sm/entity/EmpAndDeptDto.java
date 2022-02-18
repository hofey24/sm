package com.hofey.sm.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: hofey
 * @Date: 2022/2/17 21:22
 * @Description:
 */
@Data
public class EmpAndDeptDto{


    private Integer id;
    private String name;
    private String mobile;
    private String province;
    private String city;
    private String county;
    private String address;
    private Date birthday;
    private Integer deptId;

    private Dept dept;
}
