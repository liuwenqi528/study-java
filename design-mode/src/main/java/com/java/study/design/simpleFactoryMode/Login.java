package com.java.study.design.simpleFactoryMode;

/**
 * @description 登录方式接口
 * @author lwq
 * @Date 2019-08-02 14:29
 * @param
 */
public interface Login {
    /**
     * @description 登录方法
     * @author lwq
     * @Date 2019-08-02 14:30
     * @param username
     * @param password
     */
    boolean login(String username, String password);
}
