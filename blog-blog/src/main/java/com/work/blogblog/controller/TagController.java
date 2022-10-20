package com.work.blogblog.controller;

import com.work.blogblog.entity.Tag;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Tag接口定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/15 8:44
 */
@Api(value = "自定义标签接口")
@RequestMapping(value = "/v1/blog")
public interface TagController {

    /**
     * 创建标签
     *
     * @param       tag-->待创建标签
     * @return      创建的标签
     */
    @ApiOperation(value = "创建标签接口")
    @PostMapping(value = "/tag")
    Tag insert(@RequestBody Tag tag);

    /**
     * 更新标签
     *
     * @param       id-->待更新标签ID
     * @param       tag-->待更新标签
     * @return      更新的标签
     */
    @ApiOperation(value = "更新专栏接口")
    @PutMapping(value = "/tag/{id}")
    Tag update(@PathVariable("id") String id, @RequestBody Tag tag);

    /**
     * 删除标签
     *
     * @param       id-->待删除标签
     */
    @ApiOperation(value = "删除标签接口")
    @DeleteMapping(value = "/tag/{id}")
    void delete(@PathVariable("id") String id);

    /**
     * 根据createUserId查询创建的一级标签列表
     *
     * @param       createUserId-->创建人ID
     * @return      查询到的一级标签列表
     */
    @ApiOperation(value = "查询一级标签列表接口")
    @DeleteMapping(value = "/tags/{createUserId}")
    List<Tag> findList(@PathVariable("createUserId") String createUserId);
}
