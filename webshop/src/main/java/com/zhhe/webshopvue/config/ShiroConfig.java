package com.zhhe.webshopvue.config;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Author：ZouHeng
 * Des:
 * Date:2020-06-27 17:19
 */
@Configuration
public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){
        System.out.println("执行 ShiroFileterFactoryBean.shiroFilter");

        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        Map<String, String> map = new LinkedHashMap<>();
        //登出
        map.put("/logout", "logout");
        //对所有用户认证
        map.put("/**", "authc");
        //登录
        shiroFilterFactoryBean.setLoginUrl("/login");
        //首页
        shiroFilterFactoryBean.setSuccessUrl("/index");
        //错误页面，认证不通过跳转
        shiroFilterFactoryBean.setUnauthorizedUrl("/error");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
        return shiroFilterFactoryBean;
    }

    @Bean
    public SecurityManager securityManager(){
        DefaultSecurityManager securityManager = new DefaultSecurityManager();

        //如果不是前后端分离，则不必设置下面的sessionManager
//        securityManager.setSessionManager();

        //使用自定义的cacheManager

        //设置realm
        securityManager.setRealm(userRealm());

        return securityManager;
    }

    /**
     * 自定义Realm
     * @return
     */
    @Bean
    public UserRealm userRealm(){
        UserRealm userRealm = new UserRealm();

        //设置加解密规则(暂时不用)
//        userRealm.setCredentialsMatcher(hashedCredentialsMatcher());

        return userRealm;
    }

    /**
     * 密码加解密规则
     * @return
     */
    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher(){
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();

        //设置散列算法
        hashedCredentialsMatcher.setHashAlgorithmName("md5");

        //设置散列次数
        hashedCredentialsMatcher.setHashIterations(2);

        return hashedCredentialsMatcher;
    }
}
