package com.jason.anno.dao;

import com.jason.anno.bean.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao extends BaseDao<Student> {
    public void save() {
        System.out.println("保存学生");
    }
}
