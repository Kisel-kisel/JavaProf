package lessons.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate start = LocalDate.MIN;
        System.out.println(start);

        LocalDate someDate = LocalDate.of(2023, Month.MARCH,31);
        someDate = someDate.plusDays(4);
        System.out.println(someDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);


    }
}
