package com.lxh.rabc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.lxh.rabc.mapper")
public class RabcApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabcApplication.class, args);
    }

}
