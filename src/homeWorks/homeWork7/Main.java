package homeWorks.homeWork7;

import homeWorks.homeWork7.Pensioner;
import homeWorks.homeWork7.Worker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        List<String> countOfChild1 = new ArrayList<>();
        countOfChild1.add("qqq");
        countOfChild1.add("WWW");
        worker.setAgeOfPerson(45);
        worker.setMaxSalary(2300);
        worker.setMinSalary(1000);
        worker.setCountOfChild(countOfChild1);
        System.out.println( worker.getCountOfChild());
        worker.die();
        System.out.println(worker.calculatePension());
    }
}
