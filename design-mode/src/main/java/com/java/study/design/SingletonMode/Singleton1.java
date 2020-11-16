package com.java.study.design.SingletonMode;

/**

 * 单例类--饿汉模式   线程安全
 * @author Administrator
 *
 */
public class Singleton1
{
    private static final Singleton1 INSTANCE = new Singleton1();

    private static boolean flag = true;
    private Singleton1()
    {
    }

    public static Singleton1 newInstance()
    {
        return INSTANCE;
    }

}
