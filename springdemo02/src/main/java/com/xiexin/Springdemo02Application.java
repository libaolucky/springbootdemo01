package com.xiexin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiexin.dao")
public class Springdemo02Application {

    public static void main(String[] args) {
        SpringApplication.run(Springdemo02Application.class, args);
    }

}
