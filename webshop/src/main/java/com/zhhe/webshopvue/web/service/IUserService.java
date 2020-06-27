package com.zhhe.webshopvue.web.service;

import com.zhhe.webshopvue.web.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ZouHeng
 * @since 2020-06-27
 */
public interface IUserService extends IService<User> {
    User selectByUsername(String username);

}
