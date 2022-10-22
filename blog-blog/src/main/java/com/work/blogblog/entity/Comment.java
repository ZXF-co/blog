package com.work.blogblog.entity;

import com.work.blogcommon.constant.BusinessConstant;
import com.work.blogcommon.entity.AbstractEntity;

import java.util.List;

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
     * 评论内容
     */
    private String content;
    /**
     * 评论者ID
     */
    private String reviewerId;
    /**
     * 评论者姓名
     */
    private String reviewerName;
    /**
     * 被评论者ID
     */
    private String beReviewerId;
    /**
     * 被评论者姓名
     */
    private String beReviewerName;
    /**
     * 相对位置编号
     */
    private int locationId;
    /**
     * 是否可用状态
     */
    private BusinessConstant.StateType state;
    /**
     * 所属blog主键ID
     */
    private String blogId;
    /**
     * 子评论列表
     */
    private List<Comment> sonList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBeReviewerId() {
        return beReviewerId;
    }

    public void setBeReviewerId(String beReviewerId) {
        this.beReviewerId = beReviewerId;
    }

    public String getBeReviewerName() {
        return beReviewerName;
    }

    public void setBeReviewerName(String beReviewerName) {
        this.beReviewerName = beReviewerName;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int LocationId) {
        this.locationId = locationId;
    }

    public BusinessConstant.StateType getState() {
        return state;
    }

    public void setState(BusinessConstant.StateType state) {
        this.state = state;
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    public List<Comment> getSonList() {
        return sonList;
    }

    public void setSonList(List<Comment> sonList) {
        this.sonList = sonList;
    }
}
