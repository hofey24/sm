package com.hofey.sm.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @Author: hofey
 * @Date: 2022/2/8 17:37
 * @Description:
 */
@Data
public class User {
    private Integer id;
    private String name;
    private Integer sex;
    private String mobile;
    private Date createTime;
}
