package lessons.lesson8;

import lessons.lesson5.Worker;

import java.util.ArrayList;
import java.util.List;

public class MainWorkers {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        worker1.setName("QQQ");
        worker2.setName("www");


        List<Worker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);

        for (Worker worker : workers) {
            System.out.println("My name is" + worker.getName());
        }


    }
}


//    public static void main(String[] args) {
//        Worker workerFirst = new Worker();
//        workerFirst.setName("Павел");
//        workerFirst.setMinSalary(1500);
//        workerFirst.setMaxSalary(3000);
//        workerFirst.setYears(56);
//
//
//        Worker workerSecond = new Worker();
//        workerSecond.setName("Иван");
//        workerSecond.setMinSalary(2000);
//        workerSecond.setMaxSalary(4000);
//        workerSecond.setYears(35);
//
//
//
//
//        List<Worker> workers = new ArrayList<>();
//        workers.add(workerFirst);
//        workers.add(workerSecond);
//
//        for (Worker worker : workers) {
//            System.out.println("Меня зовут: " + worker.getName());
//            double result = worker.requestFundToCalculatePension();
//            System.out.println("и я получу пенсию в размере: " + result);
//        }
//
//
//    }
//}
//

//        for (int i = 0; i < 1000; i++) {
//            Worker worker = new Worker();
//            worker.setName(String.valueOf(i));
//            worker.setYears(i);
//            worker.setMinSalary(i * 2);
//            worker.setMaxSalary(i * 3);
//
//            workers.add(worker);
//        }
//
//        System.out.println(workers);
//
//
//        for (Worker worker : workers) {
//            System.out.println("Меня зовут: " + worker.getName());
//            double result = worker.requestFundToCalculatePension();
//            System.out.println("и я получу пенсию в размере: " + result);
//        }
//
//}
