package com.java.study.keyword;

public class VolatileTest {
    static class Work {
       volatile boolean isShutDown = false;

        void shutdown() {
            isShutDown = true;
            System.out.println("shutdown!");
        }

        void doWork() {
            while (!isShutDown) {
                if(!isShutDown) {
                    System.out.println("doWork");
                }
            }
        }
    }

    public static void main(String[] args) {
        Work work = new Work();

        new Thread(work::doWork).start();
        new Thread(work::doWork).start();
        new Thread(work::doWork).start();
        new Thread(work::shutdown).start();
        new Thread(work::doWork).start();
        new Thread(work::doWork).start();
        new Thread(work::doWork).start();
    }
}
