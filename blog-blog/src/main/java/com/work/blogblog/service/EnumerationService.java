package com.work.blogblog.service;

import com.work.blogblog.entity.Enumeration;
import com.work.blogblog.query.EnumerationQuery;

import java.util.List;

/**
 * Enumeration服务
 *
 * @author zhouxiaofa
 * @date 2022/10/25 16:21
 */
public interface EnumerationService {

    /**
     * 通过id查询枚举常量
     *
     * @param       id-->待查询枚举常量ID
     * @return      查询到的枚举常量
     */
    Enumeration findById(String id);

    /**
     * 创建枚举常量
     *
     * @param       enumeration-->待创建枚举常量
     */
    void insert(Enumeration enumeration);

    /**
     * 更新枚举常量
     *
     * @param       enumeration-->待更新枚举常量
     */
    void update(Enumeration enumeration);

    /**
     * 删除枚举常量
     *
     * @param       id-->待删除枚举常量ID
     */
    void delete(String id);

    /**
     * 条件查询枚举常量列表
     *
     * @param       enumerationQuery-->枚举常量查询条件
     * @return      查询到的枚举常量列表
     */
    List<Enumeration> findListByCondition(EnumerationQuery enumerationQuery);
}
