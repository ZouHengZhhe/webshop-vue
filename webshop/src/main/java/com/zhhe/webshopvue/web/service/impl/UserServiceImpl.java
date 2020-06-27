package com.zhhe.webshopvue.web.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhhe.webshopvue.web.entity.User;
import com.zhhe.webshopvue.web.mapper.UserMapper;
import com.zhhe.webshopvue.web.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ZouHeng
 * @since 2020-06-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByUsername(String username) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("username", username);
        return userMapper.selectOne(queryWrapper);
    }
}
