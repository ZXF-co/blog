package com.work.blogconsumer.entity;

import com.work.blogcommon.constant.BusinessConstant;
import com.work.blogcommon.entity.AbstractEntity;

import java.util.Date;

/**
 * EducationInfo(教育信息)定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/24 20:09
 */
public class EducationInfo extends AbstractEntity {

    /**
     * 主键ID
     */
    private String id;
    /**
     * 教育类型
     */
    private BusinessConstant.SchoolLevel type;
    /**
     * 学校名称
     */
    private String school;
    /**
     * 学院名称
     */
    private String college;
    /**
     * 专业名称
     */
    private String major;
    /**
     * 入学时间
     */
    private Date startTime;
    /**
     * 毕业时间
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

    public BusinessConstant.SchoolLevel getType() {
        return type;
    }

    public void setType(BusinessConstant.SchoolLevel type) {
        this.type = type;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
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
