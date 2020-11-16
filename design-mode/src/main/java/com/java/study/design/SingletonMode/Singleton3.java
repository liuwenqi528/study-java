package com.java.study.design.SingletonMode;

/**
 * 双重校验锁     线程安全
 * @author Administrator
 *
 */
public class Singleton3
{
    private static Singleton3 instance = null;
    //禁止指令重排优化
    //private static volatile Singleton3 instance = null;
    private Singleton3(){}

    public static Singleton3 getInstance()
    {
        if(null == instance)
        {
            synchronized (Singleton3.class)
            {
                if(null == instance)
                {
                    //双重校验
                    instance = new Singleton3();
                }

            }
        }
        return instance;
    }

}
