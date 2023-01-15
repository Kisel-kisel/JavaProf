package lessons.lesson1;

public class Car {
    String color;

    int number;  //0

    boolean isSuperCar;

    //поведение (методы и функции)




    public Car(String color, int number, boolean isSuperCar) {
        this.color = color;
        this.number = number;
        this.isSuperCar = isSuperCar;
    }

    public Car(String color, boolean isSuperCar) {
        this.color = color;
        this.isSuperCar = isSuperCar;
    }
    public void go() {
        if (isSuperCar) {
            System.out.println( color + "Car go" + number + "too fast");
        } else{
            System.out.println(color + "another" + number);
        }
    }


}
