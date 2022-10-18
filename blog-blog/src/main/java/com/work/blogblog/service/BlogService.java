package com.work.blogblog.service;

import com.work.blogblog.entity.Blog;

/**
 * Blog服务
 *
 * @author zhouxiaofa
 * @date 2022/10/15 8:40
 */
public interface BlogService {

    Blog select(String id);

    void insert(Blog blog);

}
