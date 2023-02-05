package homeWorks.homeWork11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Person> comparable = new TreeSet<>();
        Worker worker = new Worker();
        worker.setNameOfPerson("Masha");
        worker.setAgeOfPerson(29);

        Worker worker1 = new Worker();
        worker1.setNameOfPerson("Dasha");
        worker1.setAgeOfPerson(37);

        Worker worker2 = new Worker();
        worker2.setNameOfPerson("Dana");
        worker2.setAgeOfPerson(53);

        Worker worker3 = new Worker();
        worker3.setNameOfPerson("MIHAIL");
        worker3.setAgeOfPerson(16);

        Worker worker4 = new Worker();
        worker4.setNameOfPerson("Abdurabek");
        worker4.setAgeOfPerson(85);

        comparable.add(worker4);
        comparable.add(worker3);
        comparable.add(worker2);
        comparable.add(worker1);
        comparable.add(worker);

        System.out.println(comparable);


//        Map<String, Integer> comparable = new TreeMap<>();
//        Set<Worker> comp = new TreeSet<>();











        Company belarus = new Company("Belarus");
        Company germany = new Company("Germany");
        Map<String,String> belarusHolidays = new HashMap<>();
        Map<String,String> germanyHolidays = new HashMap<>();
        germanyHolidays.put("New Year's Day", "1 Jan");
        germanyHolidays.put("Epiphany", "6 Jan");
        germanyHolidays.put("Good Friday", "15 Apr");
        germanyHolidays.put("Labour Day", "1 May");
        germanyHolidays.put("Ascension Day", "26 May");
        germanyHolidays.put("Whit Monday", "6 Jun");
        germanyHolidays.put("Day of German Unity", "3 Oct");
        germanyHolidays.put("Christmas Day", "25 Dec");
        germanyHolidays.put("2nd Day of Christmas", "26 Dec");
        belarusHolidays.put("New Year's Day","1 Jan");
        belarusHolidays.put("New Year Holiday","2 Jan");
        belarusHolidays.put("Orthodox Christmas Day","7 Jan");
        belarusHolidays.put("Radonitsa","25 Apr");
        belarusHolidays.put("Labour Day","1 May");
        belarusHolidays.put("Victory Day","9 May");
        belarusHolidays.put("Independence Day","3 Jul");
        belarusHolidays.put("October Revolution Day","7 Nov");
        belarusHolidays.put("Catholic Christmas Day","25 Dec");


        belarus.setHolidays(belarusHolidays);
        System.out.println(belarus);
        germany.setHolidays(germanyHolidays);
        System.out.println(germany);

    }
}
