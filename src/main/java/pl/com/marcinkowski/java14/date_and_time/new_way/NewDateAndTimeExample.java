package pl.com.marcinkowski.java14.date_and_time.new_way;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class NewDateAndTimeExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.now();

        System.out.println(localTime);

        LocalTime fiveMinutesEarlier = localTime1.minusMinutes(5);
        System.out.println(fiveMinutesEarlier);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate bitwa = LocalDate.of(1410,7,15);
        System.out.println(bitwa);

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate,localTime);
        System.out.println(localDateTime);
        System.out.println(localDateTime1);

        String formatedTime = localDateTime.format(DateTimeFormatter.ofPattern("YYYY-MM-dd_HH:mm"));
        System.out.println(formatedTime);

        Date maybeNow = new Date();
        long time = maybeNow.getTime();
        Instant instant = Instant.ofEpochMilli(time);
        LocalDateTime maybeNowNewWay = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(maybeNowNewWay);

    }
}
