package com.java.study.design.simpleFactoryMode;
/**
 * @description  登录工厂
 * @author lwq
 * @Date 2019-08-02 14:47
 * @param
 */
public class LoginManageFactory {
    public static Login getLogin(String loginType) {
        if ("password".equals(loginType)) {
            return new PasswordLogin();
        } else if ("domain".equals(loginType)) {
            return new DomainLogin();
        } else {
            throw new RuntimeException("类型不存在。");
        }

    }
}
