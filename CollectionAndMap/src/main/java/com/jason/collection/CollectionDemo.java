package com.jason.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(true);
        collection.add(1.23);
        collection.add("123");
        System.out.println(collection);
        for (Object o : collection) {
            System.out.println(o);
        }
    }


}
