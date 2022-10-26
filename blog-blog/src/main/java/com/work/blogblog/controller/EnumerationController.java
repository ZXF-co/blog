package com.work.blogblog.controller;

import com.work.blogblog.entity.Enumeration;
import com.work.blogblog.query.EnumerationQuery;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Enumeration接口定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/25 15:51
 */
@Api(value = "枚举常量模块接口")
@RequestMapping(value = "/v1/blog")
public interface EnumerationController {

    /**
     * 创建枚举常量
     *
     * @param       enumeration-->待创建枚举常量
     * @return      创建的枚举常量
     */
    @ApiOperation(value = "创建枚举常量接口")
    @PostMapping(value = "/enumeration")
    Enumeration creat(@RequestBody Enumeration enumeration);

    /**
     * 更新枚举常量
     *
     * @param       id-->待更新枚举常量ID
     * @param       enumeration-->待更新枚举常量
     * @return      更新的枚举常量
     */
    @ApiOperation("更新枚举常量接口")
    @PutMapping(value = "/enumeration/{id}")
    Enumeration update(@PathVariable("id") String id, @RequestBody Enumeration enumeration);

    /**
     * 条件查询枚举常量列表
     *
     * @param       enumerationQuery-->枚举常量查询条件
     * @return      查询到的枚举常量列表
     */
    @ApiOperation("条件查询枚举常量列表接口")
    @GetMapping(value = "/enumerations")
    List<Enumeration> findListByCondition(EnumerationQuery enumerationQuery);
}
