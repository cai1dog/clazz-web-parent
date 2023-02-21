package com.baizhi.yk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baizhi.yk.mapper")
public class CityApplication {
    public static void main(String[] args) {
        SpringApplication.run(CityApplication.class,args);
    }
}
