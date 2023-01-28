package homeWorks.homeWork9;

import java.util.Iterator;
import java.util.List;

public abstract class Person {
    private String nameOfPerson;
    private int ageOfPerson;
    private int heightOfPerson;
    private int weightOfPerson;
    private List<String> countOfChild;
    private Iterator iterator;

    public List<String> getCountOfChild() {
        return countOfChild;
    }
//    Iterator iterator = countOfChild.iterator();

    public int setCountOfChild(List<String> countOfChild) {
        this.countOfChild = countOfChild;
        return 0;
    }

    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    public int setAgeOfPerson(int ageOfPerson) {
        this.ageOfPerson = ageOfPerson;
        return ageOfPerson;
    }

    public void setHeightOfPerson(int heightOfPerson) {
        this.heightOfPerson = heightOfPerson;
    }

    public void setWeightOfPerson(int weightOfPerson) {
        this.weightOfPerson = weightOfPerson;
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public int getAgeOfPerson() {
        return ageOfPerson;
    }

    public int getHeightOfPerson() {
        return heightOfPerson;
    }

    public int getWeightOfPerson() {
        return weightOfPerson;
    }

    public abstract void die();


    public Person(String nameOfPerson, int ageOfPerson, int heightOfPerson, int weightOfPerson) {
        this.nameOfPerson = nameOfPerson;
        this.ageOfPerson = ageOfPerson;
        this.heightOfPerson = heightOfPerson;
        this.weightOfPerson = weightOfPerson;
    }

    public Person() {

    }

    public void infoAboutPerson() {
        System.out.println(nameOfPerson + " is " + ageOfPerson + " years old and he has height " + heightOfPerson + " and weight " + weightOfPerson + " !");
    }

    public void goToWork() {
        if (ageOfPerson < 18 || ageOfPerson > 70) {
            System.out.println("Resting at home!");
        } else {
            System.out.println("Go to work! ");
        }
    }

    public void infoAboutChildren2() {
        System.out.println("У меня " + getCountOfChild().size() + " детей!");
        for (int i = 0; i < getCountOfChild().size(); i++) {
            System.out.println(i + 1 + ") " + getCountOfChild().get(i));
        }
    }

    public void infoAboutChildren() {
        System.out.println("У меня " + getCountOfChild().size() + " детей!");
        for (String s : countOfChild) {
            System.out.println(s);

        }

    }

}

