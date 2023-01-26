package homeWorks.homeWork8;

import homeWorks.homeWork8.Pensioner;
import homeWorks.homeWork8.Worker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Worker worker2 = new Worker();
        List<String> countOfChild1 = new ArrayList<>();
        List<String> countOfChild2 = new ArrayList<>();
        List<String> companies1 = new ArrayList<>();
        List<String> companies2 = new ArrayList<>();
        Company company = new Company();

        companies1.add(company.setName("Apple"));
        companies1.add(company.setName("Google"));
        companies1.add(company.setName("Asus"));

        companies2.add(company.setName("Sea"));
        companies2.add(company.setName("Flight"));
        companies2.add(company.setName("Plans"));


        countOfChild1.add("Pety");
        countOfChild1.add("Nasty");
        countOfChild1.add("Pes");

        countOfChild2.add("Bars");
        countOfChild2.add("Vania");
        countOfChild2.add("Vlad");

        worker.setCountOfChild(countOfChild1);
        worker2.setCountOfChild(countOfChild2);

        worker.setCompanies(companies1);
        worker2.setCompanies(companies2);

        worker.infoAboutChildren();
        worker.myCompanies();
        worker.infoAboutChildren2();

        worker2.infoAboutChildren();
        worker2.myCompanies();
        worker2.infoAboutChildren2();



    }
}

