package com.xina.demo1008;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class Demo1008Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1008Application.class, args);
    }

}
