package com.work.blogblog.controller.impl;

import com.work.blogblog.controller.BlogController;
import com.work.blogblog.entity.Tag;
import com.work.blogblog.service.TagService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Blog接口定义实现类
 *
 * @author zhouxiaofa
 * @date 2022/10/9 16:08
 */
@RestController
public class BlogControllerImpl implements BlogController {

    @Resource
    private TagService tagService;

    @Override
    public List<Tag> findTagList(String createUserId) {
        return tagService.findTagList(createUserId);
    }
}
