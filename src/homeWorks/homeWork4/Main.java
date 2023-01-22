package homeWorks.homeWork4;

import homeWorks.homeWork4.Pensioner;
import homeWorks.homeWork4.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setAgeOfPerson(45);
        worker.setMaxSalary(2300);
        worker.setMinSalary(1000);
        int x = worker.getAgeOfPerson() * 200;

        System.out.println(worker.calculatePension());
    }
}
