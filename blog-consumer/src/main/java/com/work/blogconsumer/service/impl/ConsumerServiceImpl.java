package com.work.blogconsumer.service.impl;

import com.work.blogconsumer.entity.Consumer;
import com.work.blogconsumer.entity.EducationInfo;
import com.work.blogconsumer.entity.WorkInfo;
import com.work.blogconsumer.mapper.ConsumerMapper;
import com.work.blogconsumer.service.ConsumerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Consumer服务实现类
 *
 * @author zhouxiaofa
 * @date 2022/9/30 13:49
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Resource
    private ConsumerMapper consumerMapper;

    @Override
    public void insert(Consumer consumer) {
        consumerMapper.insertConsumer(consumer);
    }

    @Override
    public Consumer login(String account, String password) {
        return consumerMapper.login(account, password);
    }

    @Override
    public void insertEducationInfo(EducationInfo educationInfo) {
        consumerMapper.insertEducationInfo(educationInfo);
    }

    @Override
    public void deleteEducationInfo(String id) {
        consumerMapper.deleteEducationInfo(id);
    }

    @Override
    public void insertWorkInfo(WorkInfo workInfo) {
        consumerMapper.insertWorkInfo(workInfo);
    }

    @Override
    public void deleteWorkInfo(String id) {
        consumerMapper.deleteWorkInfo(id);
    }

    @Override
    public Consumer find(String id) {
        return consumerMapper.findById(id);
    }
}
