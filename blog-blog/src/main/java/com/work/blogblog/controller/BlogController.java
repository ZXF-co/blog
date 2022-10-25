package com.work.blogblog.controller;

import com.work.blogblog.entity.Blog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Blog接口定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/9 14:52
 */
@Api(value = "博客模块接口")
@RequestMapping(value = "/v1/blog")
public interface BlogController {

    /**
     * 创建blog
     *
     * @param       blog-->待创建blog
     * @return      创建之后的blog
     */
    @ApiOperation("创建blog")
    @PostMapping(value = "/blog")
    Blog create(@RequestBody Blog blog);

    /**
     * 更新博客
     *
     * @param       id-->待更新博客ID
     * @param       blog-->待更新博客
     * @return      更新后的博客
     */
    @ApiOperation("更新博客")
    @PutMapping(value = "/blog/{id}")
    Blog update(@PathVariable("id") String id, @RequestBody Blog blog);

    /**
     * 根据id查询博客
     *
     * @param       id-->待查询博客ID
     * @return      查询到的博客
     */
    @ApiOperation("通过blogId查询对应的blog信息")
    @GetMapping(value = "/blog/{id}")
    Blog find(@PathVariable("id") String id);

    /**
     * 通过createUserId查询博客列表
     *
     * @param       createUserId-->创建人ID
     * @return      查询到的博客列表
     */
    @ApiOperation("通过createUserId查询博客列表")
    @GetMapping("/blogs/{createUserId}")
    List<Blog> findList(@PathVariable("createUserId") String createUserId);
}
