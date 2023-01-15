package lessons.lesson1;

import lessons.lesson1.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Car car = new Car("blue",565, true);
        Car secondCar = new Car("green", 178, false);
//
//        car.color = "blue";
//        secondCar.color = "green";
//
//        car.number = 565;
//        secondCar.number = 12;
//
//        car.isSuperCar = true;
//        secondCar.isSuperCar = false;


        System.out.println(car);
        System.out.println(secondCar);

//        System.out.println(car.color);
//        System.out.println(secondCar.color);
//
//        System.out.println(car.number);
//        System.out.println(secondCar.number);

        Car thirdCar = new Car("yellow", 1, false);

        System.out.println(thirdCar);
//        System.out.println(thirdCar.number);
//        System.out.println(thirdCar.color);

        int a = sum(6,5);
        System.out.println(a);
        car.go();
    }

    public static int sum(int a,int b){
        return a+b;
    }
}