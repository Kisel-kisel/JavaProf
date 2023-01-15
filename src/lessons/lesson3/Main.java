package lessons.lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        car.go();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.toString();
        System.out.println(str);

        Cabriolet cabriolet = new Cabriolet();
//        cabriolet.go();
        cabriolet.setNumber(456);
    }
}
