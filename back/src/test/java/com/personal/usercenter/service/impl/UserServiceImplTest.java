package com.personal.usercenter.service.impl;
import java.util.Date;

import com.personal.usercenter.mapper.UserMapper;
import com.personal.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author :hwy
 * @date :2022/3/16 2:00
 * @description :用户服务测试类
 * @version:
 */
@SpringBootTest
class UserServiceImplTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testAddUser(){
        User user=new User();
        user.setUsername("hwy");
        user.setUserAccount("526017616");
        user.setUserPassword("12345678");
        user.setAvatarUrl("");
        user.setEmail("");
        user.setMobilePhone("");
        int insert = userMapper.insert(user);
        Assertions.assertEquals(1,insert);

    }

}