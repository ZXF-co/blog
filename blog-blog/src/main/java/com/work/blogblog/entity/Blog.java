package com.work.blogblog.entity;

import com.work.blogcommon.entity.AbstractEntity;

import java.util.List;

/**
 * Blog定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/9 14:53
 */
public class Blog extends AbstractEntity {

    /**
     * 主键ID
     */
    private String id;
    /**
     * 博客标题
     */
    private String title;
    /**
     * 博客内容
     */
    private String content;
    /**
     * 是否可用状态
     */
    private String state;
    /**
     * 标签列表
     */
    private List<Tag> tags;

}
