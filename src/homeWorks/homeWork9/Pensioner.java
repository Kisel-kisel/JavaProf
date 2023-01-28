package homeWorks.homeWork9;

import homeWorks.homeWork8.Person;

public class Pensioner extends Person {
    private double pension;

//    private double x = (setAgeOfPerson(80)- 50) * pension;

    public double getPension() {
        return  pension;
    }

    public double setPension(double pension){
        this.pension = pension;
        return pension;
    }

    @Override
    public void die() {
        System.out.println("Этот пенсионер умер, он заработал: " );
    }
}

