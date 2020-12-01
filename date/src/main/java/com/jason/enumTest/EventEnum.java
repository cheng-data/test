package com.jason.enumTest;

public enum EventEnum {

    LAUNCH("launch"),
    PAGEVIEW("pageView"),
    EVENT("event");

    EventEnum(String name){
        this.name = name;
    }

    private String name;


    public void show(){
        System.out.println(this.name);

        EventEnum[] values = values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i].name);
        }
    }


}
