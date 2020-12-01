package com.jason.aop2.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Order(1)
public class SecurityUtil {

    @Pointcut(value = "execution( * *(..))")
    public void myPointCut(){}

    @Before("myPointCut()")
    public static void start(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println("Security：" + signature.getName() + "方法开始执行：参数是" + Arrays.asList(args));
    }

    @AfterReturning(value = "myPointCut()",returning = "result")
    public static void stop(JoinPoint joinPoint,Object result) {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println("Security：" + signature.getName() + "方法执行结束：结果是：" + result );
    }

    @AfterThrowing(value = "myPointCut()",throwing = "e")
    public static void logException(JoinPoint joinPoint,Exception e) {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println("Security：" + signature.getName() + "方法抛出异常：" + e.getMessage());
    }


    @After("myPointCut()")
    public static void logFinally(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println("Security：" + signature.getName() + "方法执行结束。。。。。over");

    }

//    @Around("execution( * *(..))")
//    public static Object around(ProceedingJoinPoint pjp) throws Throwable {
//        Signature signature = pjp.getSignature();
//        Object[] args = pjp.getArgs();
//        Object res = null;
//
//        try {
//            System.out.println("环绕通知开始：" + signature.getName() + "方法开始执行，参数为：" +Arrays.asList(args));
//            res = pjp.proceed();
//            System.out.println("环绕通知j结束：" + signature.getName() + "方法执行结束。" );
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//            System.out.println("环绕异常通知：" + signature.getName() + "方法抛出异常：" );
//            throw throwable;
//        }finally {
//            System.out.println("环绕返回通知：" + signature.getName() + "方法返回，结果为：" + res);
//        }
//        System.out.println("==============");
//
//        return res;
//    }


}
