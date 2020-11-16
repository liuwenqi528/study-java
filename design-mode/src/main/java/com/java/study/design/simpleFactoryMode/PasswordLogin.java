package com.java.study.design.simpleFactoryMode;

import lombok.extern.slf4j.Slf4j;

//口令验证登录
@Slf4j
public class PasswordLogin implements  Login{
    /**
     * @param username
     * @param password
     * @description 登录方法
     * @author lwq
     * @Date 2019-08-02 14:30
     */
    public boolean login(String username, String password) {
        // TODO Auto-generated method stub
        log.info("口令验证方式登录，用户名：{},密码：{}",username,password);

        /**
         * 业务逻辑
         */
        return true;
    }
}
