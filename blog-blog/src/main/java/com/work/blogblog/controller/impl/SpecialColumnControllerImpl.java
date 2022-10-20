package com.work.blogblog.controller.impl;

import com.work.blogblog.controller.SpecialColumnController;
import com.work.blogblog.entity.SpecialColumn;
import com.work.blogblog.service.SpecialColumnService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * SpecialColumn接口定义实现类
 *
 * @author zhouxiaofa
 * @date 2022/10/19 12:34
 */
@RestController
public class SpecialColumnControllerImpl implements SpecialColumnController {

    @Resource
    private SpecialColumnService specialColumnService;

    @Override
    public SpecialColumn insert(SpecialColumn specialColumn) {
        specialColumnService.insert(specialColumn);
        return specialColumn;
    }

    @Override
    public SpecialColumn update(String id, SpecialColumn specialColumn) {
        SpecialColumn querySpecialColumn = specialColumnService.findById(id);
        if(null == querySpecialColumn) {
            throw new RuntimeException("The SpecialColumn to be updated does not exist, the number is" + id);
        }
        // SpecialColumn存在,进行ID赋值
        specialColumn.setId(id);
        specialColumnService.update(specialColumn);
        return specialColumn;
    }

    @Override
    public void delete(String id) {
        SpecialColumn querySpecialColumn = specialColumnService.findById(id);
        if(null == querySpecialColumn) {
            throw new RuntimeException("The SpecialColumn to be deleted does not exist, the number is" + id);
        }
        specialColumnService.delete(id);
    }

    @Override
    public List<SpecialColumn> findList(String createUserId) {
        return null;
    }
}
