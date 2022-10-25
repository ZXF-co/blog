package com.work.blogconsumer.controller.impl;

import com.work.blogconsumer.controller.ConsumerController;
import com.work.blogconsumer.entity.Consumer;
import com.work.blogconsumer.entity.EducationInfo;
import com.work.blogconsumer.entity.UserManager;
import com.work.blogconsumer.entity.WorkInfo;
import com.work.blogconsumer.service.ConsumerService;
import com.work.blogconsumer.service.RedisService;
import com.work.blogconsumer.tools.TokenUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Consumer接口实现类
 *
 * @author zhouxiaofa
 * @date 2022/9/30 13:51
 */
@RestController
public class ConsumerControllerImpl implements ConsumerController {

    @Resource
    private RedisService redisService;
    @Resource
    private ConsumerService consumerService;
    @Resource
    private UserManager userManager;

    @Override
    public Map<String, Object> login(Consumer consumer) {
        Map<String, Object> map = new HashMap<>();
        if(StringUtils.isEmpty(consumer.getAccount()) || StringUtils.isEmpty(consumer.getPassword())) {
            map.put("msg", "The consumer does not enter account or password!");
            return map;
        }
        Consumer queryConsumer = consumerService.login(consumer.getAccount(), consumer.getPassword());
        if(null != queryConsumer) {
            String token = TokenUtil.generateToken(queryConsumer);
            map.put("code", 200);
            map.put("data", queryConsumer);
            map.put("token", token);
            // 暂时缓存token到redis
            // redisService.set(token, queryConsumer);
        } else {
            map.put("msg", "The consumer does not exist!");
        }
        return map;
    }

    @Override
    public Consumer create(Consumer consumer) {
        // 1.先创建用户,获取主键ID
        userManager.setCreateInfo(consumer);
        consumerService.insert(consumer);
        // 2.教育信息列表非空,进行创建
        if(!CollectionUtils.isEmpty(consumer.getEducationInfoList())) {
            for(EducationInfo educationInfo : consumer.getEducationInfoList()) {
                educationInfo.setConsumerId(consumer.getId());
                userManager.setCreateInfo(educationInfo);
                consumerService.insertEducationInfo(educationInfo);
            }
        }
        // 3.工作信息列表非空,进行创建
        if(!CollectionUtils.isEmpty(consumer.getWorkInfoList())) {
            for(WorkInfo workInfo : consumer.getWorkInfoList()) {
                workInfo.setConsumerId(consumer.getId());
                userManager.setCreateInfo(workInfo);
                consumerService.insertWorkInfo(workInfo);
            }
        }
        return consumer;
    }

    @Override
    public Consumer update(String id, Consumer consumer) {
        return null;
    }

    @Override
    public Consumer find(String id) {
        return consumerService.find(id);
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Object test() {
        return UserManager.get();
    }
}
