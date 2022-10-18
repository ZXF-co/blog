package com.work.blogblog.mapper;

import com.work.blogblog.entity.Blog;

/**
 * Blog接口定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/12 17:21
 */
public interface BlogMapper {

    /**
     * 通过id查询博客
     *
     * @param       id-->待查询博客ID
     * @return      查询到的博客信息
     */
    Blog findById(String id);

    /**
     * 创建博客
     *
     * @param       blog-->待创建博客
     */
    void insert(Blog blog);

    /**
     * 通过id更新博客
     *
     * @param       blog-->待更新博客
     */
    void update(Blog blog);

    /**
     * 通过id删除博客
     *
     * @param       id-->待删除博客ID
     */
    void delete(String id);

    /**
     * 通过id查询blog信息(附加其他)
     *
     * @param       id-->待查询博客ID
     * @return      查询到的博客信息
     */
    Blog select(String id);
}
