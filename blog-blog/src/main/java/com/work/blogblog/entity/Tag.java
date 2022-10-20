package com.work.blogblog.entity;

import com.work.blogcommon.constant.BusinessConstant;
import com.work.blogcommon.entity.AbstractEntity;

import java.util.List;

/**
 * tag(标签)定义类
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
     * 是否可用状态
     */
    private BusinessConstant.StateType state;
    /**
     * 父标签(最多三级标签)
     */
    private Tag parent;
    /**
     * 子标签列表(最多三级标签)
     */
    private List<Tag> sonList;

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

    public BusinessConstant.StateType getState() {
        return state;
    }

    public void setState(BusinessConstant.StateType state) {
        this.state = state;
    }

    public Tag getParent() {
        return parent;
    }

    public void setParent(Tag parent) {
        this.parent = parent;
    }

    public List<Tag> getSonList() {
        return sonList;
    }

    public void setSonList(List<Tag> sonList) {
        this.sonList = sonList;
    }
}
