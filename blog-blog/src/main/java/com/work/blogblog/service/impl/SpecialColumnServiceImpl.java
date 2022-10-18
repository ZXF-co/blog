package com.work.blogblog.service.impl;

import com.work.blogblog.entity.SpecialColumn;
import com.work.blogblog.mapper.SpecialColumnMapper;
import com.work.blogblog.service.SpecialColumnService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * SpecialColumn服务实现类
 *
 * @author zhouxiaofa
 * @date 2022/10/15 8:43
 */
@Service
public class SpecialColumnServiceImpl implements SpecialColumnService {

    @Resource
    private SpecialColumnMapper specialColumnMapper;

    @Override
    public SpecialColumn findById(String id) {
        return specialColumnMapper.findById(id);
    }

    @Override
    public void insert(SpecialColumn specialColumn) {
        specialColumnMapper.insert(specialColumn);
    }
}
