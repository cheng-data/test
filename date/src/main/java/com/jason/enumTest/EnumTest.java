package com.jason.enumTest;

public class EnumTest {
    Gender gender = Gender.女;
    Gender gender2 = Gender.男;


    public static void main(String[] args) {
        EventEnum launch = EventEnum.LAUNCH;
         launch.show();

        String name = EventEnum.PAGEVIEW.name();
        System.out.println(name);

    }


}
