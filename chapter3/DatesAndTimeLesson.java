package chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DatesAndTimeLesson {
  public static void main(String[] args) {
    System.out.println(LocalDateTime.now());
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
    LocalDate date1 = LocalDate.of(2005, 6, 7);
    LocalDate date2 = LocalDate.of(2015, Month.JANUARY, 7);
    LocalTime time1 = LocalTime.of(6, 15);
    LocalTime time2 = LocalTime.of(6, 15, 30);
    LocalTime time3 = LocalTime.of(6, 15, 30, 2000);
    LocalDateTime ldt1 = LocalDateTime.of(3005, Month.DECEMBER, 7, 6, 15);
    LocalDateTime ldt2 = LocalDateTime.of(date1, time1);
    System.out.println(ldt2);

    // date plus or minus - Years, Months, Weeks, Days
    System.out.println(date1.plusDays(40).minusWeeks(2));
    System.out.println(date1);

    // time plus or minus - Hours, Minutes, Seconds, Nano
    System.out.println(time1.plusHours(1).minusNanos(300));
    System.out.println(time1);

    // DateTime plus or minus - Years, Months Days, Hourse, Minutesm Seconds, Nano
    System.out.println(ldt1.plusDays(21).plusHours(2));
    System.out.println(ldt1);
  }
}
