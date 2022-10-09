package com.work.blogblog.mapper;

import com.work.blogblog.entity.Tag;

import java.util.List;

/**
 * Tag接口定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/9 16:15
 */
public interface TagMapper {

    /**
     * 根据创建人ID查询其创建的tags
     *
     * @param       createUserId-->创建人ID
     * @return      查询到的tags
     */
    List<Tag> findTagList(String createUserId);
}
