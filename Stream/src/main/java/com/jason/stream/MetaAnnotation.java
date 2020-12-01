package com.jason.stream;

import java.lang.annotation.*;

@MyAnnotation(name = "jason",age = 12,id = 01,likes = {"reading"})
public class MetaAnnotation {
    @MyAnnotation
    public void test(){

    }
}

@Target({ElementType.METHOD,ElementType.TYPE})   // 注解适用范围、
@Retention(RetentionPolicy.RUNTIME)   //  适用于什么环境，一般都是运行时环境
@Documented   //  注解是否显示在Javadoc中
@Inherited   // 是否能被继承
@interface MyAnnotation{

    /**
     * 定义的方式看起来像是方法，但是实际上使用是注解的时候写的名称，默认的名称是value
     * 自定义注解中填写的所有方法都需要在使用注解的时候，添加值，很麻烦,因此包含默认值
     */
    String name() default "cheng.chen";
    int age() default 12;
    int id() default 1;
    String[] likes() default {"a","b","c"};

}
