package com.atguigu.myzhxy.mapper;

import com.atguigu.myzhxy.pojo.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

//方便Spring识别扫描这个接口
@Repository
//继承BaseMapper类中的增删改查的方法，指定Admin泛型，针对这个实体类的一个操作
public interface AdminMapper extends BaseMapper<Admin> {

}
