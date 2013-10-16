/**
 * Copyright (c) 20095-2013 https://github.com/zhangkaitao
 *
 *
 */


package com.vita.erp.controller;

import com.vita.erp.common.Constants;
import com.vita.erp.entity.sys.User;
import com.vita.erp.service.sys.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Project_Name: smart-erp
 * File: LoginUserController
 * User: denghp
 * Date: 10/16/13
 * Time: 6:09 PM
 */
@RequestMapping("/sys/User")
public class LoginUserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/viewInfo")
    public String viewInfo(User user, Model model) {
        //setCommonData(model);
        model.addAttribute(Constants.OP_NAME, "查看个人资料");
        user = userService.getUserById(user.getId());
        model.addAttribute("user", user);
        //return viewName("editForm");
        return null;
    }

}
