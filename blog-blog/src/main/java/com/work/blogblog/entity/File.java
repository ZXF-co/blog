package com.work.blogblog.entity;

import com.work.blogcommon.constant.BusinessConstant;
import com.work.blogcommon.entity.AbstractEntity;

/**
 * File(文件)定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/18 23:15
 */
public class File extends AbstractEntity {

    /**
     * 主键ID
     */
    private String id;
    /**
     * 文件名称
     */
    private String name;
    /**
     * 文件类型
     */
    private String type;
    /**
     * 文件地址
     */
    private String url;
    /**
     * 是否可用状态
     */
    private BusinessConstant.StateType state;
    /**
     * 所属博客主键ID
     */
    private String blogId;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
}
