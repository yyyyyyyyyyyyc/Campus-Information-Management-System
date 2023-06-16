package com.atguigu.myzhxy.service.impl;

import com.atguigu.myzhxy.mapper.GradeMapper;
import com.atguigu.myzhxy.pojo.Grade;
import com.atguigu.myzhxy.service.GradeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@Transactional
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements GradeService {
    @Override
    public IPage<Grade> getGradeByOpr(Page<Grade> pageParam, String gradeName) {
        QueryWrapper<Grade> queryWrapper=new QueryWrapper();
        //用该方法判断是不是null值，不是空值则进行模糊查询
        if (!StringUtils.isEmpty(gradeName)) {
            queryWrapper.like("name",gradeName);
        }
        //倒序排序
        queryWrapper.orderByDesc("id");
        Page<Grade> page=baseMapper.selectPage(pageParam,queryWrapper);
        return page;

    }

    @Override
    public List<Grade> getGrades() {
        return baseMapper.selectList(null);
    }
}
