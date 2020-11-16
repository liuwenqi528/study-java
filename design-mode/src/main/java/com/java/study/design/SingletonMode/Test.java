package com.java.study.design.SingletonMode;

public class Test {
    public static void main(String[] args) {

//        testSingleton1();

        testSingleton2();

    }

    public static void testSingleton1(){
        Singleton1 singleton1 = Singleton1.newInstance();
        Singleton1 singleton2 = Singleton1.newInstance();
        System.out.println(singleton1 == singleton2);
    }
    public static void testSingleton2(){
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for(int i =0 ;i<10 ;i++) {
            Singleton2 singleton2 = Singleton2.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + singleton2);
        }
    }
}
