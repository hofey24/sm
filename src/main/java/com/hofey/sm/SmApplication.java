package com.hofey.sm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hofey
 */
@MapperScan("com.hofey.sm.mapper")
@SpringBootApplication
public class SmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmApplication.class, args);
    }

}
