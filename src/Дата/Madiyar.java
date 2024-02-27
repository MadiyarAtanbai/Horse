package Дата;

import java.awt.image.CropImageFilter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Madiyar {
    public static void main(String[] args) {
//        LocalDateTime  me = LocalDateTime.of(2002, Month.FEBRUARY,26,06,15);
//        LocalDateTime today = LocalDateTime.now();
//        System.out.println(ChronoUnit.DAYS.between(me,today)+ " менын осы кунге диын омыр сурген куным");
//        System.out.println(ChronoUnit.WEEKS.between(me,today)+ " менын осы кунге диын омыр сурген апта");
//        System.out.println(ChronoUnit.YEARS.between(me,today) +  " менын осы кунге диын омыр сурген жыл");
//        System.out.println(ChronoUnit.HOURS.between(me,today) + " менын осы кунге диын омыр сурген сагатым");
//        System.out.println(ChronoUnit.MINUTES.between(me,today) + " менын осы кунге диын омыр сурген минут");
//        System.out.println(ChronoUnit.SECONDS.between(me,today) + " менын осы кунге диын омыр сурген секунт");
        LocalDateTime me = LocalDateTime.of(2002, Month.FEBRUARY, 26, 06, 15);
        LocalDateTime today = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(me, today));
        System.out.println(ChronoUnit.WEEKS.between(me, today));
        LocalDateTime Me = LocalDateTime.of(2002, 2, 2, 2, 2);
        LocalDateTime Today = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(Me,Today));


    }
}