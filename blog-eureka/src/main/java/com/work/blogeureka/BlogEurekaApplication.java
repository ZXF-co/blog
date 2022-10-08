package com.work.blogeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zxf
 */
@SpringBootApplication
@EnableEurekaServer
public class BlogEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogEurekaApplication.class, args);
    }

}
