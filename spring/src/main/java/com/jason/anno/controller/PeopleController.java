package com.jason.anno.controller;

import com.jason.anno.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    public void save(){
        peopleService.save();
    }

}
