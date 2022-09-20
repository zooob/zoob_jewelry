package com.zoob.jewelry;


import com.zoob.jewelry.bean.User;
import com.zoob.jewelry.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class ApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void testUserMapper(){
        User user = userMapper.selectById(1L);
        log.info("用户信息：{}",user);
    }

}
