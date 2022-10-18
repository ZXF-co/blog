package com.work.blogblog.service.impl;

import com.work.blogblog.entity.Picture;
import com.work.blogblog.mapper.PictureMapper;
import com.work.blogblog.service.PictureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Picture服务实现类
 *
 * @author zhouxiaofa
 * @date 2022/10/15 8:43
 */
@Service
public class PictureServiceImpl implements PictureService {

    @Resource
    private PictureMapper pictureMapper;

    @Override
    public void insert(Picture picture) {
        pictureMapper.insert(picture);
    }
}
