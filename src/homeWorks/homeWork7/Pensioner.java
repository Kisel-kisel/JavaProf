package homeWorks.homeWork7;

import homeWorks.homeWork7.Person;

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
        int countOfChildren = 0;
        if(getCountOfChild() != null){
            countOfChildren = getCountOfChild().size();
        }
        System.out.println("Зато у меня " + countOfChildren + " детей!");
    }
}

