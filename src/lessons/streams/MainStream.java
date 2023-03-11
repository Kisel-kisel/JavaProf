package lessons.streams;

import lessons.lesson5.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class MainStream{
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        Person first = new Person();
        first.setYears(15);
        list.add(first);

        Person second = new Person();
        second.setYears(25);
        list.add(second);

        Person third = new Person();
        third.setYears(15);
        list.add(third);

        int sum = 0;

        for (Person person : list) {
            int age = person.getYears();
            age += 5;
            sum +=age;
        }
        System.out.println(sum);

        Optional answer = list.stream()
                .map(Person::getYears)
                .map(age -> age + 5)
                .reduce(Integer::sum);
        Car car = () ->   System.out.println("goes");
        Car car1 = () ->   System.out.println("goes 1");
        Car car2 = () ->   System.out.println("goes 2");

        System.out.println(car.getClass());
        System.out.println(car1.getClass());
        System.out.println(car2.getClass());


        car.goes();
        car1.goes();
        car2.goes();

    }

}
