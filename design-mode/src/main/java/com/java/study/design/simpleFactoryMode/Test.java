package com.java.study.design.simpleFactoryMode;

public class Test {
    public static void main(String[] args) {
        String type = "password";
        Login login = LoginManageFactory.getLogin(type);
        boolean result = login.login("admin","password");
    }
}
