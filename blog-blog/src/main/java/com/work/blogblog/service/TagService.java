package com.work.blogblog.service;

import com.work.blogblog.entity.SpecialColumn;
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
     * 通过id查询标签
     *
     * @param       id-->待查询标签ID
     * @return      查询到的标签
     */
    Tag findById(String id);

    /**
     * 创建标签
     *
     * @param       tag-->待创建标签
     */
    void insert(Tag tag);

    /**
     * 通过id更新标签
     *
     * @param       tag-->待更新标签
     */
    void update(Tag tag);

    /**
     * 通过id删除标签
     *
     * @param       id-->待删除标签ID
     */
    void delete(String id);

    /**
     * 根据创建人ID查询其创建的tags
     *
     * @param       createUserId-->创建人ID
     * @return      查询到的tags
     */
    List<Tag> findTagList(String createUserId);
}
