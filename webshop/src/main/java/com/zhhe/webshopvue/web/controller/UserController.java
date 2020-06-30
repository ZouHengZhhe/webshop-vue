package com.zhhe.webshopvue.web.controller;


import com.zhhe.webshopvue.web.entity.User;
import com.zhhe.webshopvue.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ZouHeng
 * @since 2020-06-27
 */
@RestController
@RequestMapping("/web/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("get")
    public User get(Integer id) {
        return userService.getById(id);
    }
}
