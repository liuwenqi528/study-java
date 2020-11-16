package com.java.study.moreModule;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setUsername("liuwenqi");
        student.setChengji(20);
        add(student);
    }
    public static void add(UserBase userBase){
        System.out.println(userBase.getClass());
    }
}
