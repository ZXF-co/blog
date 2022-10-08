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
     * 创建consumer
     *
     * @param       consumer-->待创建consumer
     * @return      创建的consumer
     */
    Consumer create(Consumer consumer);

    /**
     * 通过ID查询Consumer
     *
     * @param       id-->Consumer主键ID
     * @return      查询到的Consumer
     */
    Consumer find(String id);
}
