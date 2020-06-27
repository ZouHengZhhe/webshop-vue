package com.zhhe.webshopvue.config;

import com.zhhe.webshopvue.web.entity.Permission;
import com.zhhe.webshopvue.web.entity.Role;
import com.zhhe.webshopvue.web.entity.User;
import com.zhhe.webshopvue.web.service.IRoleService;
import com.zhhe.webshopvue.web.service.IUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/*
 * Author：ZouHeng
 * Des:
 * Date:2020-06-27 17:21
 */
public class UserRealm extends AuthorizingRealm {
    @Autowired
    private IUserService userService;
    @Autowired
    private IRoleService roleService;

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("授权 doGetAuthorizationInfo");
        User newUser = (User)principalCollection.getPrimaryPrincipal();
        User user = userService.selectByUsername(newUser.getUsername());

        Role role = roleService.getById(user.getRoleId());
        List<String> permissionList = new ArrayList<>();
        for (Permission permission:role.getPermissionList()){
            permissionList.add(permission.getName());
        }

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRole(role.getRoleName());
        info.addStringPermissions(permissionList);
        return null;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("认证 doGetAuthenticationInfo");
        String username = (String)authenticationToken.getPrincipal();
        User user = userService.selectByUsername(username);
        String pwd = user.getPassword();
        if (pwd == null || "".equals(pwd)){
            return null;
        }
        return new SimpleAuthenticationInfo(user,pwd,this.getClass().getName());
    }
}
