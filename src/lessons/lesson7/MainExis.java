package lessons.lesson7;

import lessons.lesson5.Pensioner;
import lessons.lesson5.Person;
import lessons.lesson5.Worker;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainExis {
    public static void main(String[] args) {
        int[] array = new int[5];
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();//полиморфизм
        array[0] = 1;
        array[1] = 2;
        array[2] = 5;
        array[3] = 7;
        array[4] = 27;

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,500);
        list.remove(0);
        System.out.println(list);


//        list.set(3, 300);//заменяет
//        list.contains(1000);//boolean yes or no


//        int a = list.get(1);
//
//        System.out.println(a);
//
//        int len = array.length;
//        int len1 = list.size();

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] = 27){
//                System.out.println(i);
//                break;
//            }
//        }
//        int index = list.indexOf(27);
//        System.out.println(index);



    }
}
