package com.jason.aop;

import com.jason.aop.proxy.CalculatorProxy;
import com.jason.aop.service.Calculator;
import com.jason.aop.service.MyCalculator;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

public class MyTest {

    @Test
    public void test01(){
//        MyCalculator calculator = new MyCalculator();
//        System.out.println(calculator.add(1, 2));

//        Proxy.newProxyInstance()
        Calculator calculator = CalculatorProxy.getCalculator(new MyCalculator());
        calculator.add(1,2);
        calculator.sub(1,1);
        calculator.mul(1,1);
        calculator.div(1,0);


    }


//    @Test
//    public void test02(){
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextaoc.xml");
//        Calculator calculator = context.getBean("myCalculator", Calculator.class);
//        calculator.add(1,2);
//        calculator.sub(1,1);
//        calculator.mul(1,10);
//        calculator.div(1,0);
//        System.out.println(calculator.getClass());
//    }

}
