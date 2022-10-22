package com.work.blogconsumer.entity;

import com.work.blogcommon.entity.AbstractEntity;

import java.util.List;

/**
 * Consumer定义类
 *
 * @author zhouxiaofa
 * @date 2022/9/30 13:35
 */
public class Consumer extends AbstractEntity {

    /**
     * 主键ID
     */
    private String id;
    /**
     * 用户登录账号
     */
    private String account;
    /**
     * 用户登录密码
     */
    private String password;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 用户性别
     */
    private String gender;
    /**
     * 用户电话号码
     */
    private String phone;
    /**
     * 用户描述
     */
    private String description;
    /**
     * 是否可用状态
     */
    private String state;
    /**
     * 关注列表
     */
    private List<Follower> followers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public List<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Follower> followers) {
        this.followers = followers;
    }
}
