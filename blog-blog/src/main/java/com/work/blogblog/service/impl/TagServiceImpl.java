package com.work.blogblog.service.impl;

import com.work.blogblog.entity.Tag;
import com.work.blogblog.mapper.TagMapper;
import com.work.blogblog.service.TagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Tag服务实现类
 *
 * @author zhouxiaofa
 * @date 2022/10/9 16:14
 */
@Service
public class TagServiceImpl implements TagService {

    @Resource
    private TagMapper tagMapper;

    @Override
    public List<Tag> findTagList(String createUserId) {
        return tagMapper.findTagList(createUserId);
    }
}
