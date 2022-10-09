package com.work.blogblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zxf
 */
@MapperScan(basePackages = "com.work.blogblog.mapper")
@SpringBootApplication
public class BlogBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogBlogApplication.class, args);
    }

}
