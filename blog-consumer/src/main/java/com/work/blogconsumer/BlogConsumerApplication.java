package com.work.blogconsumer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zxf
 */
@MapperScan(basePackages = "com.work.blogconsumer.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class BlogConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogConsumerApplication.class, args);
    }

}
