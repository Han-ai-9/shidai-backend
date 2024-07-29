package com.han.shidai;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动类
 *
 */
@SpringBootApplication
@MapperScan("com.han.shidai.mapper")
@EnableScheduling
public class ShiDaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiDaiApplication.class, args);
    }

}

