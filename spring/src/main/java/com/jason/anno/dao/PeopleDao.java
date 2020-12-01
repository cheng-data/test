package com.jason.anno.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PeopleDao {

    public void save(){
        System.out.println("保存成功");
    }


}
