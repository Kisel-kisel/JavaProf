package homeWorks.homeWork8;

import homeWorks.homeWork8.Person;

public class Pensioner extends Person {
    private double pension;


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
        int countOfChildren = 0;
        if(getCountOfChild() != null){
            countOfChildren = getCountOfChild().size();
        }
        System.out.println("Зато у меня " + countOfChildren + " детей!");
    }
}
