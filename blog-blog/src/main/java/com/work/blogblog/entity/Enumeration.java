package com.work.blogblog.entity;

import com.work.blogcommon.constant.BusinessConstant;
import com.work.blogcommon.entity.AbstractEntity;

/**
 * Enumeration(枚举字典)定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/25 15:44
 */
public class Enumeration extends AbstractEntity {

    /**
     * 主键ID
     */
    private String id;
    /**
     * 枚举常量编码值
     */
    private String code;
    /**
     * 枚举常量名称
     */
    private String name;
    /**
     * 描述
     */
    private String description;
    /**
     * 排序
     */
    private int sort;
    /**
     * 枚举常量类型
     */
    private String type;
    /**
     * 枚举常量来源
     */
    private String source;
    /**
     * 是否可用状态
     */
    private BusinessConstant.StateType state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public BusinessConstant.StateType getState() {
        return state;
    }

    public void setState(BusinessConstant.StateType state) {
        this.state = state;
    }
}
