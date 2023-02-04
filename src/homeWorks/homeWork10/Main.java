package homeWorks.homeWork10;

import lessons.lesson10.ArrayListImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        lessons.lesson10.ArrayListImplementation list = new ArrayListImplementation(10);
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        list.add(2);
        list.add(4);
        list.add(10);
        list.add(23);
        list.add(65);
        list.add(5);
        list.add(234);
        list.add(2234);
        list.add(734);


        System.out.println(list.size());
        System.out.println(Arrays.toString(list.array));
        list.remove(3);
        list.add(4,999);
        System.out.println(list.toString());



    }
}
