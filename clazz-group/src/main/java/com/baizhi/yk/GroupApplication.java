package com.baizhi.yk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@MapperScan("com.baizhi.yk.mapper")

public class GroupApplication {
    public static void main(String[] args) {
        SpringApplication.run(GroupApplication.class,args);
    }
}
