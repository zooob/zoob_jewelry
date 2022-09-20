package com.zoob.jewelry.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zoob.jewelry.api.apiReques;
import com.zoob.jewelry.bean.User;
import com.zoob.jewelry.service.UserService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping("/user")
    public List<User> userInfo(){
        List<User> list = userService.list();
        return list;
    }

    /*
    *    eq：等于，ne：不等于
    *    gt：大于，ge：大于等于，lt：小于，le：小于等于
    * */

    @RequestMapping("/login")
    public apiReques userLogin(@RequestParam("username")String username,
                               @RequestParam("password")String password){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name",username);
        wrapper.eq("pass_word",password);
        User user = userService.getOne(wrapper);
        return new apiReques(200,user);
    }
}
