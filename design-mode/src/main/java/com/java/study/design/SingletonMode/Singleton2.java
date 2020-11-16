package com.java.study.design.SingletonMode;

/**
 * 懒汉式单例模式   线程不安全
 * @author Administrator
 *
 */
public class Singleton2
{
    private static Singleton2 instance = null;

    private Singleton2(){}

    /*
     * 1.未加同步锁
     */
//    public static Singleton2 getInstance()
//    {
//        if(instance == null)
//        {
//            instance = new Singleton2();
//        }
//        return instance;
//    }

    /*
     * 2.加同步锁     线程安全
     * 上面的懒汉模式并没有考虑多线程的安全问题，在多线程可能并发调用它的getInsatance()方法，
     * 导致创建多个实例，因此需要加锁来解决线程同步问题。
     */
    public static synchronized Singleton2 getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton2();
        }
        return instance;
    }
 }
