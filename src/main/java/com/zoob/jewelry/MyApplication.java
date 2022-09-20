package com.zoob.jewelry;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zoob.jewelry.mapper")
@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyApplication.class, args);
    }
}
