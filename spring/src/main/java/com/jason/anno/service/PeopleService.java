package com.jason.anno.service;

import com.jason.anno.dao.PeopleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope(value = "prototype")
public class PeopleService {

    @Autowired
    private PeopleDao peopleDao;

    public void save(){
        peopleDao.save();
    }

}
