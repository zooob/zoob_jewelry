package com.zoob.jewelry.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import jdk.jfr.DataAmount;
import lombok.Data;

@Data
@TableName("t_user")
public class User {
    private Long id;
    private String userName;
    private String passWord;
    private Integer age;
    private String gender;
    private String email;

}
