package com.jason.aop.proxy;

import com.jason.aop.service.Calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CalculatorProxy {
    public static Calculator getCalculator(final Calculator calculator){
//        获取类加载器
        ClassLoader loader = calculator.getClass().getClassLoader();
//        被代理对象的所有接口
        Class<?>[] interfaces = calculator.getClass().getInterfaces();

        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("invoke方法被会执行了。。。");
                System.out.println(method.getName() + "开始执行了，参数列表是：" + Arrays.asList(args));
                Object res = method.invoke(calculator,args);
                System.out.println(method.getName() + "执行结束，结果是：" + res);
                return res;
            }
        };
        Object o = Proxy.newProxyInstance(loader, interfaces, handler);
        return (Calculator)o;
    }
}
