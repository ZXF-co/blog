package com.work.blogblog.controller;

import com.work.blogblog.entity.Picture;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Picture接口定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/15 8:51
 */
@Api(value = "图片接口")
@RequestMapping(value = "/v1/picture")
public interface PictureController {

    /**
     * 上传图片资源
     *
     * @param       pictures-->待上传图片列表
     * @return      上传后的图片存储信息
     */
    @PostMapping(value = "/pictures")
    Map<String, Object> insert(@RequestPart("files") MultipartFile[] pictures);

    @PostMapping(value = "/picture")
    void insertOne(@RequestBody Picture picture);

    @GetMapping(value = "/picture/{id}")
    Picture find(@PathVariable("id") String id);
}
