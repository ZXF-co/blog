package com.work.blogblog.controller;

import com.work.blogblog.entity.SpecialColumn;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * SpecialColumn接口定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/19 12:29
 */
@Api(value = "专栏接口")
@RequestMapping(value = "/v1/blog")
public interface SpecialColumnController {

    /**
     * 创建专栏
     *
     * @param       specialColumn-->待创建专栏
     * @return      创建的专栏
     */
    @ApiOperation(value = "创建专栏接口")
    @PostMapping(value = "/specialColumn")
    SpecialColumn insert(@RequestBody SpecialColumn specialColumn);

    /**
     * 更新专栏
     *
     * @param       id-->待更新专栏ID
     * @param       specialColumn-->待更新专栏
     * @return      更新的专栏
     */
    @ApiOperation(value = "更新专栏接口")
    @PutMapping(value = "/specialColumn/{id}")
    SpecialColumn update(@PathVariable("id") String id, @RequestBody SpecialColumn specialColumn);

    /**
     * 删除专栏
     *
     * @param       id-->待删除专栏
     */
    @ApiOperation(value = "删除专栏接口")
    @DeleteMapping(value = "/specialColumn/{id}")
    void delete(@PathVariable("id") String id);

    /**
     * 根据createUserId查询创建的专栏列表
     *
     * @param       createUserId-->创建人ID
     * @return      查询到的专栏列表
     */
    @ApiOperation(value = "查询专栏列表接口")
    @DeleteMapping(value = "/specialColumns/{createUserId}")
    List<SpecialColumn> findList(@PathVariable("createUserId") String createUserId);
}
