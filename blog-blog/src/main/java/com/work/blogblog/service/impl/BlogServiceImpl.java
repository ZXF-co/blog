package com.work.blogblog.service.impl;

import com.work.blogblog.entity.Blog;
import com.work.blogblog.mapper.BlogMapper;
import com.work.blogblog.service.BlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Blog服务实现类
 *
 * @author zhouxiaofa
 * @date 2022/10/15 8:42
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Resource
    private BlogMapper blogMapper;

    @Override
    public Blog select(String id) {
        return blogMapper.select(id);
    }

    @Override
    public void insert(Blog blog) {
        blogMapper.insert(blog);
    }
}
