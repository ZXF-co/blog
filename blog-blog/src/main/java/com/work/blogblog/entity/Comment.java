package com.work.blogblog.entity;

import com.work.blogcommon.entity.AbstractEntity;

/**
 * Comment(评论)定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/10 12:39
 */
public class Comment extends AbstractEntity {

    /**
     * 主键ID
     */
    private String id;
    /**
     * 所属blog主键ID
     */
    private String blogId;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 评论者ID
     */
    private String reviewerId;
    /**
     * 评论者名称
     */
    private String reviewerName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }
}
