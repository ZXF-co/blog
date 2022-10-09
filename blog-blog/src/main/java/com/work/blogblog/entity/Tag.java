package com.work.blogblog.entity;

import com.work.blogcommon.entity.AbstractEntity;

/**
 * tag定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/9 14:55
 */
public class Tag extends AbstractEntity {

    /**
     * 标签主键ID
     */
    private String id;
    /**
     * 标签名称
     */
    private String name;
    /**
     * 标签描述
     */
    private String description;
    /**
     * 标签父ID
     */
    private String parentId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
