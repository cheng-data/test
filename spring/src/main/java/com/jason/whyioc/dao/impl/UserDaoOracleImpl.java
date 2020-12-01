package com.jason.whyioc.dao.impl;

import com.jason.whyioc.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("从Oracle获取用户");
    }
}
