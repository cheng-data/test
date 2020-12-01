package com.jason.whyioc.dao.impl;

import com.jason.whyioc.dao.UserDao;

public class UserDaoMysqlImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("从MySQL获取用户");
    }
}
