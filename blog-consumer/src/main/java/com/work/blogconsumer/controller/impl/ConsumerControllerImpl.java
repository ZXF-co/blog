package com.work.blogconsumer.controller.impl;

import com.work.blogcommon.tools.TokenUtil;
import com.work.blogconsumer.controller.ConsumerController;
import com.work.blogconsumer.entity.Consumer;
import com.work.blogconsumer.service.ConsumerService;
import org.apache.commons.lang.StringUtils;
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
    private ConsumerService consumerService;

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
        } else {
            map.put("msg", "The consumer does not exist!");
        }
        return map;
    }

    @Override
    public Consumer create(Consumer consumer) {
        return consumerService.create(consumer);
    }

    @Override
    public Consumer find(String id) {
        return consumerService.find(id);
    }
}
