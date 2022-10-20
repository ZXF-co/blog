package com.work.blogblog.query;

/**
 * SpecialColumn查询定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/19 13:47
 */
public interface SpecialColumnQuery {

    /**
     * 根据ID查询专栏
     * @param       id-->专栏ID
     * @return      查询到的专栏
     */
    SpecialColumnQuery id(String id);

    /**
     * 根据创建人ID查询专栏
     *
     * @param       createUserId-->创建人ID
     * @return      查询到的专栏
     */
    SpecialColumnQuery createUserId(String createUserId);
}
