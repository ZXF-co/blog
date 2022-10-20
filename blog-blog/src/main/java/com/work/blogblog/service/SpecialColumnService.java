package com.work.blogblog.service;

import com.work.blogblog.entity.SpecialColumn;

import java.util.List;

/**
 * SpecialColumn服务
 *
 * @author zhouxiaofa
 * @date 2022/10/15 8:41
 */
public interface SpecialColumnService {

    /**
     * 通过id查询专栏
     *
     * @param       id-->待查询专栏ID
     * @return      查询到的专栏
     */
    SpecialColumn findById(String id);

    /**
     * 创建专栏
     *
     * @param       specialColumn-->待创建专栏
     */
    void insert(SpecialColumn specialColumn);

    /**
     * 通过id更新专栏
     *
     * @param       specialColumn-->待更新专栏
     */
    void update(SpecialColumn specialColumn);

    /**
     * 通过id删除专栏
     *
     * @param       id-->待删除专栏ID
     */
    void delete(String id);

    /**
     * 通过createUserId查询创建的专栏列表
     *
     * @param       createUserId-->通过
     * @return      查询到的专栏列表
     */
    List<SpecialColumn> findList(String createUserId);
}
