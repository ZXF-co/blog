package com.work.blogblog.service.impl;

import com.work.blogblog.entity.SpecialColumn;
import com.work.blogblog.mapper.SpecialColumnMapper;
import com.work.blogblog.query.SpecialColumnQuery;
import com.work.blogblog.query.impl.SpecialColumnQueryImpl;
import com.work.blogblog.service.SpecialColumnService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public void update(SpecialColumn specialColumn) {
        specialColumnMapper.update(specialColumn);
    }

    @Override
    public void delete(String id) {
        specialColumnMapper.delete(id);
    }

    @Override
    public List<SpecialColumn> findList(String createUserId) {
        SpecialColumnQueryImpl specialColumnQuery = new SpecialColumnQueryImpl();
        specialColumnQuery.createUserId(createUserId);
        List<SpecialColumn> specialColumnList = specialColumnMapper.findList(specialColumnQuery);
        return specialColumnList;
    }
}
