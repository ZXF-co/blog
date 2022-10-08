package com.work.blogcommon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zxf
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BlogCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogCommonApplication.class, args);
    }

}
