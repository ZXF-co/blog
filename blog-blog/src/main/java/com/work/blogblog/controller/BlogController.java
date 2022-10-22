package com.work.blogblog.controller;

import com.work.blogblog.entity.Blog;
import com.work.blogblog.entity.Tag;
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
    Blog insert(@RequestBody Blog blog);


    /**
     * 根据创建人ID查询其创建的tags
     *
     * @param       createUserId-->创建人ID
     * @return      查询到的tags
     */
    @ApiOperation("通过创建人ID查询对应的tags")
    @GetMapping(value = "/tags/{createUserId}")
    List<Tag> findTagList(@PathVariable("createUserId") String createUserId);

    /**
     * 根据blogId查询对应blog信息
     *
     * @param       blogId-->blogId
     * @return      查询到的blog信息
     */
    @ApiOperation("通过blogId查询对应的blog信息")
    @GetMapping(value = "/{blogId}")
    Blog select(@PathVariable("blogId") String blogId);
}
