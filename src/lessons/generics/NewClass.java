package lessons.generics;

import homeWorks.homeWork9.Worker;
import lessons.lesson5.Pensioner;

import java.util.List;

public class NewClass{
    public void first(List<? super Pensioner> firstList){
            firstList.add(new Pensioner("8x",44, 5, 6, 8));
            firstList.add(new Pensioner("77",77, 7, 7, 7));
            firstList.add(new Pensioner("99",99, 9, 9, 9));
    }


    public void second(List<? extends Worker> secondList){
        for (Worker worker : secondList) {
            worker.getPensionFunds();
        }

    }
}
