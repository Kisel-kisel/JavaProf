package homeWorks.homeWork11;

import lessons.lesson5.Sex;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class Person implements Comparable<Person> {
    private String nameOfPerson;
    private int ageOfPerson;
    private int heightOfPerson;
    private int weightOfPerson;
    private List<Person> countOfChild;
    private Sex sex;

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    Set<Person> comp;
    private Iterator iterator;


    public List<Person> getCountOfChild() {
        return countOfChild;
    }


    public int setCountOfChild(List<Person> countOfChild) {
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

    @Override
    public String toString() {
        return  nameOfPerson + " is " + ageOfPerson + " years old!";
    }

    public void infoAboutChildren() {
        System.out.println("У меня " + getCountOfChild().size() + " детей!");
        for (Person s : countOfChild) {
            System.out.println(s);

        }


    }
    @Override
    public int compareTo(Person p){
        if(nameOfPerson.length() > p.getNameOfPerson().length()){
            return -1;
        } else if (nameOfPerson.length() < p.getNameOfPerson().length()) {
            return 1;
        }else {
            if(ageOfPerson > p.getAgeOfPerson()){
                return -1;
            } else if (ageOfPerson < p.getAgeOfPerson()) {
                return 1;
            }else {
                return nameOfPerson.compareTo(p.nameOfPerson) ;
            }

        }


    }


}

