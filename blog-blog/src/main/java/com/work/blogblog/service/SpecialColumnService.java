package com.work.blogblog.service;

import com.work.blogblog.entity.SpecialColumn;

/**
 * SpecialColumn服务
 *
 * @author zhouxiaofa
 * @date 2022/10/15 8:41
 */
public interface SpecialColumnService {

    SpecialColumn findById(String id);

    void insert(SpecialColumn specialColumn);
}
