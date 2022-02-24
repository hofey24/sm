package com.hofey.sm.entity;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: hofey
 * @Date: 2022/2/8 17:37
 * @Description:
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer sex;
    private String mobile;
    private Date createTime;
}
