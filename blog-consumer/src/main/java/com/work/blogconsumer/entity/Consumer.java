package com.work.blogconsumer.entity;

import com.work.blogcommon.constant.BusinessConstant;
import com.work.blogcommon.entity.AbstractEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Consumer(用户)定义类
 *
 * @author zhouxiaofa
 * @date 2022/9/30 13:35
 */
public class Consumer extends AbstractEntity implements Serializable {

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
     * 用户QQ
     */
    private String qq;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 用户地址
     */
    private String location;
    /**
     * 用户描述
     */
    private String description;
    /**
     * 是否可用状态
     */
    private String state;
    /**
     * 学历
     */
    private BusinessConstant.EducationType education;
    /**
     * 专业级别/职称
     */
    private String professionalGrade;
    /**
     * 教育经历列表
     */
    private List<EducationInfo> educationInfoList;
    /**
     * 工作经历列表
     */
    private List<WorkInfo> workInfoList;

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

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public BusinessConstant.EducationType getEducation() {
        return education;
    }

    public void setEducation(BusinessConstant.EducationType education) {
        this.education = education;
    }

    public String getProfessionalGrade() {
        return professionalGrade;
    }

    public void setProfessionalGrade(String professionalGrade) {
        this.professionalGrade = professionalGrade;
    }

    public List<EducationInfo> getEducationInfoList() {
        return educationInfoList;
    }

    public void setEducationInfoList(List<EducationInfo> educationInfoList) {
        this.educationInfoList = educationInfoList;
    }

    public List<WorkInfo> getWorkInfoList() {
        return workInfoList;
    }

    public void setWorkInfoList(List<WorkInfo> workInfoList) {
        this.workInfoList = workInfoList;
    }
}
