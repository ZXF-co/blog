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
    @ApiOperation("验证用户登录,获取token接口")
    @GetMapping(value = "/login")
    Map<String, Object> login(Consumer consumer);

    /**
     * 创建用户
     *
     * @param       consumer-->待创建用户
     * @return      创建的用户
     */
    @ApiOperation("创建用户接口")
    @PostMapping(value = "/consumer")
    Consumer create(@RequestBody Consumer consumer);

    /**
     * 更新用户
     *
     * @param       id-->待更新用户ID
     * @param       consumer-->待更新用户
     * @return      更新后的用户
     */
    @ApiOperation("更新用户接口")
    @PutMapping(value = "/consumer/{id}")
    Consumer update(@PathVariable("id") String id, @RequestBody Consumer consumer);

    /**
     * 通过ID查询Consumer
     *
     * @param       id-->Consumer主键ID
     * @return      查询到的Consumer
     */
    @ApiOperation("通过ID查询用户详情接口")
    @GetMapping(value = "/consumer/{id}")
    Consumer find(@PathVariable String id);

    /**
     * 删除用户
     *
     * @param       id-->待删除用户ID
     */
    @ApiOperation("删除用户接口")
    @DeleteMapping("/consumer/{id}")
    void delete(@PathVariable("id") String id);

    /**
     * 测试是否能获取当前用户信息
     *
     * @return      当前登录用户信息
     */
    @ApiOperation("测试是否能获取当前用户登录信息接口")
    @GetMapping(value = "/test")
    Object test();
}
