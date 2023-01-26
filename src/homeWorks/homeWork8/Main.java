package homeWorks.homeWork8;

import homeWorks.homeWork8.Pensioner;
import homeWorks.homeWork8.Worker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        List<String> countOfChild1 = new ArrayList<>();
        List<String> companies1 = new ArrayList<>();

        Company company = new Company();
        companies1.add(company.setName("Apple"));
        companies1.add(company.setName("Google"));
        companies1.add(company.setName("Asus"));


        countOfChild1.add("Pety");
        countOfChild1.add("Nasty");
        countOfChild1.add("Pes");
        worker.setCountOfChild(countOfChild1);
        worker.setCompanies(companies1);

        worker.infoAboutChildren();
        worker.myCompanies();
        worker.infoAboutChildren2();

    }
}

