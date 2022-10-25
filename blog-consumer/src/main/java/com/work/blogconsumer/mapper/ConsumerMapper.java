package com.work.blogconsumer.mapper;

import com.work.blogconsumer.entity.Consumer;
import com.work.blogconsumer.entity.EducationInfo;
import com.work.blogconsumer.entity.WorkInfo;

/**
 * Consumer数据管理类
 *
 * @author zhouxiaofa
 * @date 2022/9/30 13:46
 */
public interface ConsumerMapper {

    /**
     * 通过ID查询Consumer
     *
     * @param       id-->Consumer主键ID
     * @return      查询到的Consumer
     */
    Consumer findById(String id);

    /**
     * 创建consumer
     *
     * @param       consumer-->待创建consumer
     * @return      创建的consumer
     */
    void insertConsumer(Consumer consumer);

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
