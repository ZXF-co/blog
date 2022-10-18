package com.work.blogblog.entity;

import com.work.blogcommon.entity.AbstractEntity;

/**
 * SpecialColumn(专栏)定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/10 13:32
 */
public class SpecialColumn extends AbstractEntity {

    /**
     * 主键ID
     */
    private String id;
    /**
     * 专栏名称
     */
    private String name;
    /**
     * 专栏描述
     */
    private String description;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
