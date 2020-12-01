package com.jason.spring.factory;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class MyFactoryBeanTest {
    public static void main(String[] args) throws SQLException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myFactoryBean.xml");
//        Person person = context.getBean("myFactoryBean", Person.class);
//        System.out.println(person);

        DruidDataSource dataSource = context.getBean("dataSource2", DruidDataSource.class);
        System.out.println(dataSource);
        System.out.println(dataSource.getConnection());

    }
}
