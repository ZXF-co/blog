package com.work.blogconsumer.service;

/**
 * Redis服务定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/24 17:16
 */
public interface RedisService {

    /**
     * redis进行缓存
     *
     * @param       key-->key
     * @param       value-->value
     */
    void set(String key, Object value);

    /**
     * 删除redis缓存数据
     *
     * @param       key-->待删除key
     * @return      是否删除成功
     */
    Boolean delete(String key);

    /**
     * 更新redis缓存数据
     *
     * @param       key-->待更新key
     * @return      是否更新成功
     */
    Boolean update(String key);

    /**
     * 查询redis缓存
     *
     * @param       key-->待查询key
     * @return      查询到的value
     */
    Object get(String key);
}
