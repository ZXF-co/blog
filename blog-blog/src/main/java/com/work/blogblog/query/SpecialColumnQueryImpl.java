package com.work.blogblog.query;

/**
 * SpecialColumn查询定义实现类
 *
 * @author zhouxiaofa
 * @date 2022/10/19 13:50
 */
public class SpecialColumnQueryImpl implements SpecialColumnQuery{

    /**
     * 专栏ID
     */
    private String id;
    /**
     * 创建人ID
     */
    private String createUserId;

    @Override
    public SpecialColumnQuery id(String id) {
        this.id = id;
        return this;
    }

    @Override
    public SpecialColumnQuery createUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
}
