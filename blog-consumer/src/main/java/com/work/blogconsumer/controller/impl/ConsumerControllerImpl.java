package com.work.blogconsumer.controller.impl;

import com.work.blogconsumer.controller.ConsumerController;
import com.work.blogconsumer.entity.Consumer;
import com.work.blogconsumer.service.ConsumerService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Consumer接口实现类
 *
 * @author zhouxiaofa
 * @date 2022/9/30 13:51
 */
@RestController
public class ConsumerControllerImpl implements ConsumerController {

    @Resource
    private ConsumerService consumerService;

    @Override
    public Consumer create(Consumer consumer) {
        return consumerService.create(consumer);
    }

    @Override
    public Consumer find(String id) {
        return consumerService.find(id);
    }
}
