package com.work.blogconsumer.service;

import com.work.blogconsumer.entity.Consumer;
import com.work.blogconsumer.entity.EducationInfo;
import com.work.blogconsumer.entity.WorkInfo;

/**
 * Consumer服务定义类
 *
 * @author zhouxiaofa
 * @date 2022/9/30 13:48
 */
public interface ConsumerService {

    /**
     * 通过ID查询用户
     *
     * @param       id-->用户主键ID
     * @return      查询到的用户
     */
    Consumer find(String id);

    /**
     * 创建用户
     *
     * @param       consumer-->待创建用户
     * @return      创建的用户
     */
    void insert(Consumer consumer);

    /**
     * 通过name和password查询用户
     *
     * @param       account-->待查询用户账号
     * @param       password-->待查询用户密码
     * @return      查询到的用户
     */
    Consumer login(String account, String password);

    /**
     * 创建用户教育信息
     *
     * @param       educationInfo-->待创建教育信息
     */
    void insertEducationInfo(EducationInfo educationInfo);

    /**
     * 移除用户教育信息
     *
     * @param       id-->用户ID
     */
    void deleteEducationInfo(String id);

    /**
     * 创建用户工作信息
     *
     * @param       workInfo-->待创建工作信息
     */
    void insertWorkInfo(WorkInfo workInfo);

    /**
     * 移除用户工作信息
     *
     * @param       id-->用户ID
     */
    void deleteWorkInfo(String id);
}
