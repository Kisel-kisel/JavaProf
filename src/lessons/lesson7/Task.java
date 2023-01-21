package lessons.lesson7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        //Правильно создать два списка. Один ArrayList, один LinkedList (тип данных String). Добавить в каждый из них по 3 элемента.
        //Центральный элемент в ArrayList заменить на первый элемент. Удалить последний элемент.
        //к LinkedList добавить весь ArrayList.
        //* - найти самую длинную строку в вашем получившемся листе.
        List<String> array = new ArrayList<>();
        List <String> linked  = new LinkedList<>();

        array.add("One");
        array.add("Two");
        array.add("Three");

        System.out.println();

        System.out.println(array);

//        int miggle = array.size() / 2;
//        array.set(miggle, array[0]);


        linked.add("Four");
        linked.add("Fife");
        linked.add("Six");

        System.out.println(linked);



    }
}
