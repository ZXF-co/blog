package com.work.blogblog.entity;

import com.work.blogcommon.entity.AbstractEntity;

import java.util.List;

/**
 * Blog(博客)定义类
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
     * 专栏
     */
    private SpecialColumn specialColumn;
    /**
     * 标签列表
     */
    private List<Tag> tags;
    /**
     * 图片列表
     */
    private List<Picture> pictures;
    /**
     * 评论列表
     */
    private List<Comment> comments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public SpecialColumn getSpecialColumn() {
        return specialColumn;
    }

    public void setSpecialColumn(SpecialColumn specialColumn) {
        this.specialColumn = specialColumn;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
