package com.jason.aop2.service;

import org.springframework.stereotype.Service;

//@Service
public class MyCalculator implements Calculator {
    // 实现接口，用jdk代理，不实现接口，使用cglib代理，在MyTest测试
    public Integer add(Integer m, Integer j) {
        int res = m + j;
        return res;
    }

    public Integer sub(Integer m, Integer j) {
        int res = m - j;
        return res;
    }

    public Integer mul(Integer m, Integer j) {
        int res = m * j;
        return res;
    }

    public Integer div(Integer m, Integer j) {
        int res = m / j;
        return res;
    }
}
