package com.smarterp.dao.service.sys;

import com.smarterp.dao.BaseTest;
import com.smarterp.entity.sys.User;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.smarterp.service.sys.UserService;
/**
 * Project_Name: smart-erp
 * File: BaseUserTest
 * User: denghp
 * Date: 10/15/13
 * Time: 5:19 PM
 * Description:
 */
public class BaseUserTest extends BaseTest{

    @Autowired
    protected UserService userService;

    protected String username = "__z__deng123";
    protected String email = "denghp@163.com";
    protected String mobilePhoneNumber = "15612345678";
    protected String password = "123456";

    protected User user;

    @Before
    public void setUp(){
        user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setMobilePhoneNumber(mobilePhoneNumber);
        user.setPassword(password);
    }



}
