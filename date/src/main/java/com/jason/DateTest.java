package com.jason;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest {

    public static void main(String[] args) throws ParseException {
        java.util.Date date = new java.util.Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = format.format(date);
        System.out.println(dateStr);


        java.util.Date dat = format.parse("2020-10-10 10:10:10");
        System.out.println(dat);


        Calendar calendar = Calendar.getInstance();  //  获取当前时间
        System.out.println(calendar);

        calendar.setTime(date);
        System.out.println(calendar);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.SECOND));


    }


}
