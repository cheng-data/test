package com.jason.whyioc.service.impl;

import com.jason.whyioc.dao.UserDao;
import com.jason.whyioc.dao.impl.UserDaoImpl;
import com.jason.whyioc.dao.impl.UserDaoMysqlImpl;
import com.jason.whyioc.dao.impl.UserDaoOracleImpl;
import com.jason.whyioc.service.UserService;

public class UserServiceImpl implements UserService {

//    private UserDao userDao = new UserDaoImpl();
//    private UserDao userDao = new UserDaoMysqlImpl();
//    private UserDao userDao = new UserDaoOracleImpl();


    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }


    @Override
    public void getUser() {
        userDao.getUser();
    }
}
