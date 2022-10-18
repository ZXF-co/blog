package com.work.blogblog.mapper;

import com.work.blogblog.entity.Comment;

/**
 * Comment接口定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/12 17:21
 */
public interface CommentMapper {

    /**
     * 通过id查询评论
     *
     * @param       id-->待查询评论ID
     * @return      查询到的评论
     */
    Comment findById(String id);

    /**
     * 创建评论
     *
     * @param       comment-->待创建评论
     */
    void insert(Comment comment);

    /**
     * 通过id更新评论
     *
     * @param       comment-->待更新评论
     */
    void update(Comment comment);

    /**
     * 删除评论
     *
     * @param       id-->待删除评论ID
     */
    void delete(String id);
}
