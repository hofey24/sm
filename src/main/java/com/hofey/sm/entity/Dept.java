package com.hofey.sm.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: hofey
 * @Date: 2022/2/17 18:20
 * @Description: 部门表
 */
@Data
public class Dept implements Serializable {
    private Integer id;
    private String name;
}
