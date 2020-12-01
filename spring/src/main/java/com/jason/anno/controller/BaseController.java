package com.jason.anno.controller;

import com.jason.anno.dao.BaseDao;
import com.jason.anno.dao.StudentDao;
import com.jason.anno.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {

//    @Autowired
//    TeacherDao teacherDao;
//
//    @Autowired
//    StudentDao studentDao;
//
//    public void save(){
//        teacherDao.save();
//    }
//
//    public void save2(){
//        studentDao.save();
//    }


    /**
     *
     * 使用泛型
     */
    @Autowired
    private BaseDao baseDao;

    public void save(){
        baseDao.save();
    }


}
