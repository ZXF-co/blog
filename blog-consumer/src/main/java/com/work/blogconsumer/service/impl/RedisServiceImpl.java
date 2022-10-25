package com.work.blogconsumer.service.impl;

import com.work.blogconsumer.service.RedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * Redis服务定义实现类
 *
 * @author zhouxiaofa
 * @date 2022/10/24 17:20
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Resource
    private RedisTemplate redisTemplate;

    @Override
    public void set(String key, Object value) {
        RedisSerializer redisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(redisSerializer);
        ValueOperations<String, Object> vo = redisTemplate.opsForValue();
        // 设置过期时间为1hour
        vo.set(key, value, 1, TimeUnit.HOURS);
    }

    @Override
    public Boolean delete(String key) {
        return redisTemplate.delete(key);
    }

    @Override
    public Boolean update(String key) {
        // 重新设置过期时间为1hour
        return redisTemplate.expire(key, 1, TimeUnit.HOURS);
    }

    @Override
    public Object get(String key) {
        ValueOperations<String, Object> vo = redisTemplate.opsForValue();
        return vo.get(key);
    }
}
