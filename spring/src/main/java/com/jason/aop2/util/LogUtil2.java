package com.jason.aop2.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogUtil2 {
    @Pointcut(value = "execution( * *(..))")
    public void myPointCut(){}

    //    @Before("execution(public int com.jason.aop2.service.MyCalculator.*(*,* ))")
    @Before("myPointCut()")
    public static void start(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println(signature.getName() + "方法开始执行：参数是" + Arrays.asList(args));
    }

    //    public static void start(Method method,Object... objects){
//        System.out.println(method.getName() + "方法开始执行：参数是" + Arrays.asList(objects));
//    }
//    @AfterReturning("execution(public int com.jason.aop2.service.MyCalculator.*(int,int ))")
    @AfterReturning(value = "myPointCut()",returning = "result")
    public static void stop(JoinPoint joinPoint,Object result) {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println(signature.getName() + "方法执行结束：结果是：" + result );
    }
//    public static void stop(Method method,Object... objects){
//        System.out.println(method.getName() + "方法执行结束：结果是" + Arrays.asList(objects));
//    }

//        @AfterThrowing("execution(public int com.jason.aop2.service.MyCalculator.*(int,int ))")
    @AfterThrowing(value = "myPointCut()",throwing = "e")
    public static void logException(JoinPoint joinPoint,Exception e) {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println(signature.getName() + "方法抛出异常：" + e.getMessage());
    }

    //    public static void logException(Method method,Exception e){
//        System.out.println(method.getName() + "方法抛出异常：" + e.getMessage());
//    }
//    @After("execution(public int com.jason.aop2.service.MyCalculator.*(int,int ))")
    @After("myPointCut()")
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

}
