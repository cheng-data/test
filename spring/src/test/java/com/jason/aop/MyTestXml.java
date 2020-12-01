package com.jason.aop;

import com.jason.aop2.service.Calculator;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTestXml {


    @Test
    public void test02(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop3.xml");
        Calculator calculator = context.getBean("myCalculator", Calculator.class);
        calculator.add(1,2);
        calculator.sub(1,1);
        calculator.mul(1,10);
//        calculator.div(1,0);
        System.out.println(calculator.getClass());
    }

}
