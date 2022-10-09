package com.work.blogblog.controller;

import com.work.blogblog.entity.Tag;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
     * 根据创建人ID查询其创建的tags
     *
     * @param       createUserId-->创建人ID
     * @return      查询到的tags
     */
    @ApiOperation("通过创建人ID查询对应的tags")
    @GetMapping(value = "/tags/{createUserId}")
    List<Tag> findTagList(@PathVariable("createUserId") String createUserId);
}
