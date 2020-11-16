package com.java.study.java8.streamapi;

import java.util.stream.Stream;

public class StreamApiDemo {
    public static void main(String[] args) {
        long num  = parallelSum(10);
        System.out.println("num==="+num);
    }
    public static long parallelSum(long n){
        return Stream.iterate(1L, i -> i +1) .limit(n) .parallel()
                .reduce(0L,Long::sum);
    }


}
