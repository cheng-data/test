package com.jason.spring.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MyTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
//        Person person = (Person)context.getBean("person");
//        Person person = context.getBean("person",Person.class);
//        System.out.println(person);



//        bean之间的继承关系
        Person person = context.getBean("son",Person.class);
        System.out.println(person);
    }
}
