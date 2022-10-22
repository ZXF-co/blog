package com.work.blogconsumer.controller;

import com.work.blogconsumer.entity.Consumer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Consumer接口定义类
 *
 * @author zhouxiaofa
 * @date 2022/9/30 13:40
 */
@Api(value = "用户模块接口")
@RequestMapping(value = "/v1/consumer")
public interface ConsumerController {

    /**
     * 用户登录验证
     *
     * @param       consumer-->待验证登录用户
     * @return      获取用户登录token
     */
    @ApiOperation("验证用户登录,获取token")
    @GetMapping(value = "/login")
    Map<String, Object> login(Consumer consumer);

    /**
     * 创建consumer
     *
     * @param       consumer-->待创建consumer
     * @return      创建的consumer
     */
    @ApiOperation("创建consumer")
    @PostMapping(value = "/consumer")
    Consumer create(@RequestBody Consumer consumer);

    /**
     * 通过ID查询Consumer
     *
     * @param       id-->Consumer主键ID
     * @return      查询到的Consumer
     */
    @ApiOperation("通过ID查询Consumer")
    @GetMapping(value = "/consumer/{id}")
    Consumer find(@PathVariable String id);
}
