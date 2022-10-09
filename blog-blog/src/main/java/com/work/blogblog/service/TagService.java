package com.work.blogblog.service;

import com.work.blogblog.entity.Tag;

import java.util.List;

/**
 * Tag服务
 *
 * @author zhouxiaofa
 * @date 2022/10/9 16:12
 */
public interface TagService {


    /**
     * 根据创建人ID查询其创建的tags
     *
     * @param       createUserId-->创建人ID
     * @return      查询到的tags
     */
    List<Tag> findTagList(String createUserId);
}
