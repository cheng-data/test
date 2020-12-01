package com.jason.whyioc.dao.impl;

import com.jason.whyioc.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("获取用户");
    }
}
