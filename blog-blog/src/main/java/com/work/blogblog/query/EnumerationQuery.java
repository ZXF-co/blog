package com.work.blogblog.query;

/**
 * Enumeration查询定义类
 *
 * @author zhouxiaofa
 * @date 2022/10/25 15:56
 */
public interface EnumerationQuery {

    /**
     * 根据ID查询枚举常量
     *
     * @param       id-->枚举常量ID
     * @return      查询到的枚举常量
     */
    EnumerationQuery id(String id);

    /**
     * 根据编码查询枚举常量
     *
     * @param       code-->枚举常量编码
     * @return      查询到的枚举常量
     */
    EnumerationQuery code(String code);

    /**
     * 根据名称查询枚举常量
     *
     * @param       name-->枚举常量名称
     * @return      查询到的枚举常量
     */
    EnumerationQuery name(String name);

    /**
     * 根据类型查询枚举常量
     *
     * @param       type-->枚举常量类型
     * @return      查询到的枚举常量
     */
    EnumerationQuery type(String type);

    /**
     * 根据来源查询枚举常量
     *
     * @param       source-->枚举常量来源
     * @return      查询到的枚举常量
     */
    EnumerationQuery source(String source);
}
