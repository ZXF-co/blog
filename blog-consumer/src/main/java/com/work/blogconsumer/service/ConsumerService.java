package com.work.blogconsumer.service;

import com.work.blogconsumer.entity.Consumer;

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
    Consumer create(Consumer consumer);

    /**
     * 通过name和password查询用户
     *
     * @param       account-->待查询用户账号
     * @param       password-->待查询用户密码
     * @return      查询到的用户
     */
    Consumer login(String account, String password);
}
