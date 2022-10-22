package com.work.blogblog.query.impl;

import com.work.blogblog.query.BlogQuery;

/**
 * Blog查询定义实现类
 *
 * @author zhouxiaofa
 * @date 2022/10/21 12:39
 */
public class BlogQueryImpl implements BlogQuery {

    /**
     * 博客ID
     */
    private String id;
    /**
     * 博客标题
     */
    private String title;
    /**
     * 是否查询专栏
     */
    private boolean withSpecialColumn;
    /**
     * 是否查询标签
     */
    private boolean withTag;
    /**
     * 是否查询图片
     */
    private boolean withPicture;
    /**
     * 是否查询评论
     */
    private boolean withComment;

    @Override
    public BlogQuery id(String id) {
        this.id = id;
        return this;
    }

    @Override
    public BlogQuery title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public BlogQuery withSpecialColumn() {
        this.withSpecialColumn = true;
        return this;
    }

    @Override
    public BlogQuery withTag() {
        this.withTag = true;
        return this;
    }

    @Override
    public BlogQuery withPicture() {
        this.withPicture = true;
        return this;
    }

    @Override
    public BlogQuery withComment() {
        this.withComment = true;
        return this;
    }
}
