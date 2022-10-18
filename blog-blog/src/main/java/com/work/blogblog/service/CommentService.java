package com.work.blogblog.service;

import com.work.blogblog.entity.Comment;

/**
 * Comment服务
 *
 * @author zhouxiaofa
 * @date 2022/10/15 8:40
 */
public interface CommentService {

    Comment insert(Comment comment);

    Comment findById(String id);
}
