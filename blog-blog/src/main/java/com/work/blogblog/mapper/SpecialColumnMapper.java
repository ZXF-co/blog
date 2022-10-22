package com.work.blogblog.mapper;

import com.work.blogblog.entity.SpecialColumn;
import com.work.blogblog.query.impl.SpecialColumnQueryImpl;

import java.util.List;

/**
 * SpecialColumn接口定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/12 17:22
 */
public interface SpecialColumnMapper {

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
     * 条件查询对应专栏列表
     * @param       specialColumnQuery-->查询条件
     * @return      查询到的专栏列表
     */
    List<SpecialColumn> findList(SpecialColumnQueryImpl specialColumnQuery);
}
