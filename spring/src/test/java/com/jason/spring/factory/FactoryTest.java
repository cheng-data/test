package com.jason.spring.factory;

import com.jason.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryTest {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("iocFactory.xml");
        Person person = context.getBean("person", Person.class);
        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person);
        System.out.println(person2);



    }


}
