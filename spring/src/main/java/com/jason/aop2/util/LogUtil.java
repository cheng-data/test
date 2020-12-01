package com.jason.aop2.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
@Component
@Order(2)
public class LogUtil {
    //    @Before("execution(public int com.jason.aop2.service.MyCalculator.*(*,* ))")
    @Before("execution( * *(..))")
    public static void start(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println(signature.getName() + "方法开始执行：参数是" + Arrays.asList(args));
    }

    //    public static void start(Method method,Object... objects){
//        System.out.println(method.getName() + "方法开始执行：参数是" + Arrays.asList(objects));
//    }
//    @AfterReturning("execution(public int com.jason.aop2.service.MyCalculator.*(int,int ))")
    @AfterReturning(value = "execution( * *(..))",returning = "result")
    public static void stop(JoinPoint joinPoint,Object result) {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println(signature.getName() + "方法执行结束：结果是：" + result );
    }
//    public static void stop(Method method,Object... objects){
//        System.out.println(method.getName() + "方法执行结束：结果是" + Arrays.asList(objects));
//    }

//        @AfterThrowing("execution(public int com.jason.aop2.service.MyCalculator.*(int,int ))")
    @AfterThrowing(value = "execution( * *(..))",throwing = "e")
    public static void logException(JoinPoint joinPoint,Exception e) {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println(signature.getName() + "方法抛出异常：" + e.getMessage());
    }

    //    public static void logException(Method method,Exception e){
//        System.out.println(method.getName() + "方法抛出异常：" + e.getMessage());
//    }
//    @After("execution(public int com.jason.aop2.service.MyCalculator.*(int,int ))")
    @After("execution( * *(..))")
    public static void logFinally(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println(signature.getName() + "方法执行结束。。。。。over");

    }

    //    public static void logFinally(Method method){
//        System.out.println(method.getName() + "方法执行结束。。。。。over");
//
//    }
//    @Around("execution( * *(..))")
//    public static int around() {
//        System.out.println("================");
//        return 1;
//    }

    @Around("execution( * *(..))")
    public static Object around(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        Object[] args = pjp.getArgs();
        Object res = null;

        try {
            System.out.println("环绕通知开始：" + signature.getName() + "方法开始执行，参数为：" +Arrays.asList(args));
            res = pjp.proceed();
            System.out.println("环绕通知j结束：" + signature.getName() + "方法执行结束。" );
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕异常通知：" + signature.getName() + "方法抛出异常：" );
            throw throwable;
        }finally {
            System.out.println("环绕返回通知：" + signature.getName() + "方法返回，结果为：" + res);
        }
        System.out.println("==============");

        return res;
    }


}
