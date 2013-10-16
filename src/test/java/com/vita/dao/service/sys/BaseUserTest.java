package com.vita.dao.service.sys;

import com.vita.dao.BaseTest;
import com.vita.erp.entity.sys.User;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import com.vita.erp.service.sys.UserService;
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