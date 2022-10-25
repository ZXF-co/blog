package com.work.blogblog.controller;

import com.work.blogblog.entity.Blog;
import com.work.blogblog.query.BlogQuery;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
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
     * 创建博客
     *
     * @param       blog-->待创建博客
     * @return      创建之后的博客
     */
    @ApiOperation("创建博客接口")
    @PostMapping(value = "/blog")
    Blog create(@RequestBody Blog blog);

    /**
     * 更新博客
     *
     * @param       id-->待更新博客ID
     * @param       blog-->待更新博客
     * @return      更新后的博客
     */
    @ApiOperation("更新博客接口")
    @PutMapping(value = "/blog/{id}")
    Blog update(@PathVariable("id") String id, @RequestBody Blog blog);

    /**
     * 根据id查询博客详情
     *
     * @param       id-->待查询博客ID
     * @return      查询到的博客
     */
    @ApiOperation("通过id查询博客详情接口")
    @GetMapping(value = "/blog/{id}")
    Blog find(@PathVariable("id") String id);

    /**
     * 删除博客
     *
     * @param       id-->待删除博客ID
     */
    @ApiOperation("通过ID删除博客接口")
    @DeleteMapping(value = "/blog/{id}")
    void delete(@PathVariable("id") String id);

    /**
     * 通过createUserId查询博客列表
     *
     * @param       createUserId-->创建人ID
     * @return      查询到的博客列表
     */
    @ApiOperation("通过createUserId查询博客列表")
    @GetMapping("/blogs/{createUserId}")
    List<Blog> findList(@PathVariable("createUserId") String createUserId);

    /**
     * 条件查询博客列表
     *
     * @param       blogQuery-->博客查询条件
     * @return      查询到的博客列表
     */
    @ApiOperation("条件查询博客列表接口")
    @GetMapping(value = "/blogs")
    List<Blog> findListByCondition(BlogQuery blogQuery);
}
