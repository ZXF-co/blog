package com.work.blogblog.entity;

import com.work.blogcommon.constant.BusinessConstant;
import com.work.blogcommon.entity.AbstractEntity;

/**
 * Picture(图片)定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/10 12:36
 */
public class Picture extends AbstractEntity {

    /**
     * 主键ID
     */
    private String id;
    /**
     * 图片名称
     */
    private String name;
    /**
     * 图片类型
     */
    private String type;
    /**
     * 图片地址
     */
    private String url;
    /**
     * 相对位置编号
     */
    private int locationId;
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

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
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
}
