package pl.com.marcinkowski.java14.date_and_time.old;

import java.util.Calendar;
import java.util.Date;

public class OldDateTimeExample {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        Date nowAgain = new Date(1543152312449L);
        System.out.println(nowAgain);
        Date tomorrow= new Date(1543152312449L + (24*60*60*1000));
        System.out.println(tomorrow);

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);
        System.out.println(calendar.getTime());

        calendar.setTime(new Date());
        calendar.add(Calendar.YEAR,-1);
        calendar.add(Calendar.MONTH,-1);
        System.out.println("Date in the past: " + calendar.getTime());
    }
}


