package com.vita.dao;

import com.vita.erp.entity.sys.User;
import com.vita.erp.service.sys.UserService;
import com.vita.erp.shiro.persistence.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/*.xml")
public class UserDaoTest {
    @Resource
    private UserService userService;

    @Resource
    private UserMapper userMapper;

    @Before
    public void setup() {
    }

    @Test
    public void saveUser() throws Exception {
        User user = new User();
        user.setUsername("admianaab");
        user.setPassword("123");
        user.setEmail("aadenghaap@126.com");
        userService.saveUser(user);
    }

    @Test
    public void testMapper() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123");
        user.setEmail("denghp@126.com");
        userMapper.saveUser(user);
    }
}