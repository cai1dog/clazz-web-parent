package com.baizhi.yk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@MapperScan("com.baizhi.yk.mapper")
public class ClazzApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClazzApplication.class,args);
    }
}
