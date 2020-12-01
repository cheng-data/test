package com.jason.anno;

import com.jason.anno.bean.Teacher;
import com.jason.anno.controller.BaseController;
import com.jason.anno.controller.PeopleController;
import com.jason.anno.dao.BaseDao;
import com.jason.anno.service.PeopleService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test0(){

//        PeopleController bean = context.getBean("peopleController", PeopleController.class);
//        System.out.println(bean);

        PeopleService service1 = context.getBean("peopleService", PeopleService.class);
        PeopleService service2 = context.getBean("peopleService", PeopleService.class);
        System.out.println(service1 == service2);

        service1.save();


    }


    @Test
    public void test02(){
//        BaseController bean = context.getBean("baseController", BaseController.class);
//        bean.save();
//        bean.save2();


        BaseDao bean = context.getBean("baseController", BaseDao.class);
        bean.save();
    }





}
