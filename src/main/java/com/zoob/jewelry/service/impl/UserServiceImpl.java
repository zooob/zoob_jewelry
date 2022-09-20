package com.zoob.jewelry.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zoob.jewelry.bean.User;
import com.zoob.jewelry.mapper.UserMapper;
import com.zoob.jewelry.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
