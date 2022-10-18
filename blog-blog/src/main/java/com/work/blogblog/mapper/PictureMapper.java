package com.work.blogblog.mapper;

import com.work.blogblog.entity.Picture;

/**
 * Picture接口定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/12 17:22
 */
public interface PictureMapper {

    /**
     * 通过id查询图片
     *
     * @param       id-->待查询图片ID
     * @return      查询到的图片
     */
    Picture findById(String id);

    /**
     * 创建图片
     *
     * @param       picture-->待创建图片
     */
    void insert(Picture picture);

    /**
     * 通过id更新图片
     *
     * @param       picture-->待更新图片
     */
    void update(Picture picture);

    /**
     * 通过id删除图片
     *
     * @param       id-->待删除图片ID
     */
    void delete(String id);
}
