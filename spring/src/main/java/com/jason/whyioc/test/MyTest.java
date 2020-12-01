package com.jason.whyioc.test;

import com.jason.whyioc.dao.UserDao;
import com.jason.whyioc.dao.impl.UserDaoImpl;
import com.jason.whyioc.service.UserService;
import com.jason.whyioc.service.impl.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        UserDao userDao = new UserDaoImpl();

        userService.setUserDao(userDao);


        userService.getUser();

    }


}
