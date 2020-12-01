package com.jason.spring.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc2.xml");
//        Person2 p1 = context.getBean("person2", Person2.class);
//        Person2 p2 = context.getBean("person2", Person2.class);
//        System.out.println(p1);
//        System.out.println(p2 == p1);
    }
}
