package com.work.blogcommon.entity;

import java.util.Date;

/**
 * 基础实体类
 *
 * @author zhouxiaofa
 * @date 2022/9/30 13:27
 */
public abstract class AbstractEntity {

    /**
     * 创建人ID
     */
    private String createUserId;
    /**
     * 创建人姓名
     */
    private String createUserName;
    /**
     * 创建时间(默认当前日期)
     */
    private Date createDate = new Date();
    /**
     * 版本号(默认初始版本号=1)
     */
    private int revision = 1;

    public AbstractEntity() {
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    /**
     * 获取下一版本号方法
     */
    public int getNextRevision() {
        return this.revision + 1;
    }
}
