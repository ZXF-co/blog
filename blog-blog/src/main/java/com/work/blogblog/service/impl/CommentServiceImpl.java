package com.work.blogblog.service.impl;

import com.work.blogblog.entity.Comment;
import com.work.blogblog.mapper.CommentMapper;
import com.work.blogblog.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Comment服务实现类
 *
 * @author zhouxiaofa
 * @date 2022/10/15 8:42
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentMapper commentMapper;

    @Override
    public Comment insert(Comment comment) {
        commentMapper.insert(comment);
        return null;
    }

    @Override
    public Comment findById(String id) {
        return commentMapper.findById(id);
    }
}
