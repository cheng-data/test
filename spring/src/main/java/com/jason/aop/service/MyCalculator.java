package com.jason.aop.service;

public class MyCalculator implements Calculator {
    public int add(int m, int j) {
        int res = m + j;
        return res;
    }

    public int sub(int m, int j) {
        int res = m - j;
        return res;
    }

    public int mul(int m, int j) {
        int res = m * j;
        return res;
    }

    public int div(int m, int j) {
        int res = m / j;
        return res;
    }
}
