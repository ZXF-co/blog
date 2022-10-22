package com.work.blogconsumer.entity;

import com.work.blogcommon.entity.AbstractEntity;

/**
 * Follower(关注者)定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/10 13:44
 */
public class Follower extends AbstractEntity {

    /**
     * 主键ID
     */
    private String id;
    /**
     * 博主ID
     */
    private String consumerId;
    /**
     * 关注者ID
     */
    private String followerId;
    /**
     * 是否可用状态
     */
    private String state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }

    public String getFollowerId() {
        return followerId;
    }

    public void setFollowerId(String followerId) {
        this.followerId = followerId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
