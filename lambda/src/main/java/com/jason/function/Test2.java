package com.jason.function;

import com.sun.javafx.stage.FocusUngrabEvent;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Test2 {

    static String put(){
        System.out.println("put....");
        return "put";
    }

    public static void getSize(int size){
        System.out.println(size);
    }

    public static String toUpperCase(String str){
        return str.toUpperCase();
    }

    public static Integer getLength(String str1,String str2){
        return str1.length() + str2.length();
    }

    public static void main(String[] args) {
        System.out.println(put());

        Supplier<String> s1 = () -> Test2.put();
        System.out.println(s1.get());


        Supplier<String> s2 = Test2::put;
        System.out.println(s2.get());



        Supplier<String> s3 = Fun::hehe;
        System.out.println(s3.get());

        Consumer<Integer> c1 = Test2::getSize;
        Consumer<Integer> c2 = (size) -> Test2.getSize(size);
        c1.accept(123);


        Function<String,String> f1 = (str) -> str.toUpperCase();
        Function<String,String> f2 = (str) ->Test2.toUpperCase(str);
        Function<String,String> f3 = Test2::toUpperCase;
        Function<String,String> f4 = Fun::toUpperCase;

        System.out.println(f1.apply("abc"));
        System.out.println(f2.apply("abc"));
        System.out.println(f3.apply("abc"));
        System.out.println(f4.apply("abc"));


        BiFunction<String,String,Integer> bf = (a,b) -> a.length() +b.length();
        BiFunction<String,String,Integer> bf2 = Test2::getLength;
        System.out.println(bf.apply("abc", "jason"));
        System.out.println(bf2.apply("abc", "jason"));


    }
}


class Fun{
    public static String hehe(){
        return "hehe";
    }

    public static String toUpperCase(String str){
        return str.toUpperCase();
    }

}







