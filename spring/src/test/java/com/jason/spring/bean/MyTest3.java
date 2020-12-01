package com.jason.spring.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc3.xml");
        Person3 p1 = context.getBean("person3", Person3.class);
//        Person2 p2 = context.getBean("person2", Person2.class);
        System.out.println(p1);
//        System.out.println(p2 == p1);
    }
}
