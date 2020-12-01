package com.jason.spring.bean;

import java.util.Date;

/**
 * 没有无参构造，只有有参构造。
 */

public class Person3 {
    private String name;
    private int id;
    private int age;
    private String gender;
    private Date birth;

    public String getName() {
        return name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", birth=" + birth +
                '}';
    }
//    public String getName() {
//        return name;
//    }


    public Person3(String name, int id, int age, String gender, Date birth) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.birth = birth;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
