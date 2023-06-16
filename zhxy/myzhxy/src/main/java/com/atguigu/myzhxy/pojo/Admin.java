package com.atguigu.myzhxy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//get、set方法注解
@Data
//全参构造方法注解
@AllArgsConstructor
@NoArgsConstructor
//类与表格进行映射
@TableName("tb_admin")
public class Admin {
    @TableId(value = "id",type = IdType.AUTO)    //主键，自动判断类型
    private Integer id;
    private String name;
    private Character gender;
    private String password;
    private String email;
    private String telephone;
    private String address;
    private String portraitPath;  //头像的图片路径
}