package com.work.blogconsumer.entity;

import com.work.blogcommon.entity.AbstractEntity;

import java.util.Date;

/**
 * WorkInfo(工作信息)定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/24 20:43
 */
public class WorkInfo extends AbstractEntity {

    /**
     * 主键ID
     */
    private String id;
    /**
     * 公司名称
     */
    private String company;
    /**
     * 从事行业/领域
     */
    private String field;
    /**
     * 工作描述
     */
    private String description;
    /**
     * 工作开始时间
     */
    private Date startTime;
    /**
     * 工作结束时间
     */
    private Date endTime;
    /**
     * 所属用户ID
     */
    private String consumerId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }
}
