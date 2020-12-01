package com.jason.spring.bean;

import com.jason.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc4.xml");
//        Person p1 = context.getBean("person4", Person.class);
        Person p1 = context.getBean("person5", com.jason.bean.Person.class);
        System.out.println(p1);
    }
}
