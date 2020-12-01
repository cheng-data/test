package com.jason.spring.bean;

import java.util.Objects;

public class Person2 {
    private String name;
    private int age;

    private String desc;

    public Person2() {
        System.out.println("Person被创建 ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return age == person2.age &&
                Objects.equals(name, person2.name) &&
                Objects.equals(desc, person2.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, desc);
    }
}
