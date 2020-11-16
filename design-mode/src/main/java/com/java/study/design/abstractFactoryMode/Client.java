package com.java.study.design.abstractFactoryMode;

import com.java.study.design.abstractFactoryMode.factory.AbstractFactory;
import com.java.study.design.abstractFactoryMode.factory.IntelFactory;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        //创建工程师
        ComputeEngine ce  = new ComputeEngine();
        //创建机器型号
        AbstractFactory af = new IntelFactory();

        ce.makeComputer(af);



    }
}
