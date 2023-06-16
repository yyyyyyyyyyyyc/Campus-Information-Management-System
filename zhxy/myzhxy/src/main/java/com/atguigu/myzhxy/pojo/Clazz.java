package com.atguigu.myzhxy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//get、set方法注解
@Data
@TableName("tb_clazz")
public class Clazz {
    @TableId(value = "id",type = IdType.AUTO)    //主键，自动判断类型
    private Integer id;
    private String name;
    private Integer number;
    private String introducation;
    private String headmaster;
    private String email;
    private String telephone;
    //所属年级
    private String gradeName;      //班级所属年级
}
