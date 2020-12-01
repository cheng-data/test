package com.jason.factory;

import com.jason.bean.Person;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Person> {
    /**
     * 返回获取的bean
     * @return
     * @throws Exception
     */
    @Override
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setId(3);
        person.setName("wangwu");
        return person;
    }

    /**
     * 获取返回的bean类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    /**
     * 判断当前bean是否是单例模式
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
