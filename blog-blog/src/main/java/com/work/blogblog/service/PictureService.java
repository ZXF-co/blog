package com.work.blogblog.service;

import com.work.blogblog.entity.Picture;

/**
 * Picture服务
 *
 * @author zhouxiaofa
 * @date 2022/10/15 8:41
 */
public interface PictureService {

    /**
     * 插入图片信息
     *
     * @param       picture-->待插入图片信息
     */
    void insert(Picture picture);
}
