package com.work.blogconsumer.mapper;

import com.work.blogconsumer.entity.Consumer;

/**
 * 用户类数据管理
 *
 * @author zhouxiaofa
 * @date 2022/9/30 13:46
 */
public interface ConsumerMapper {

    /**
     * 创建consumer
     *
     * @param       consumer-->待创建consumer
     * @return      创建的consumer
     */
    void insertConsumer(Consumer consumer);

    /**
     * 通过ID查询Consumer
     *
     * @param       id-->Consumer主键ID
     * @return      查询到的Consumer
     */
    Consumer findById(String id);
}
