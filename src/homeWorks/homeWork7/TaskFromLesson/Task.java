package homeWorks.homeWork7.TaskFromLesson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        //Правильно создать два списка. Один ArrayList, один LinkedList (тип данных String). Добавить в каждый из них по 3 элемента.
        //Центральный элемент в ArrayList заменить на первый элемент. Удалить последний элемент.
        //к LinkedList добавить весь ArrayList.
        //* - найти самую длинную строку в вашем получившемся листе.

//        1.
        List<String> array = new ArrayList<>();
        List <String> linked  = new LinkedList<>();

        array.add("One");
        array.add("Two");
        array.add("Three");
        array.add("Seven");
        array.add("Eight");
        System.out.println(array);

        linked.add("Four");
        linked.add("Fife");
        linked.add("Six");
        linked.add("Nine");

        System.out.println(linked);

//        2.
        int center = array.size()/5;
        String first = array.get(0);
        array.set(center, first);
//        3.
        linked.addAll(array);
//        4.

        int maxLength = 0;
        for (int i = 0; i < linked.size(); i++) {

            if(linked.get(i).length() > maxLength){
                maxLength = linked.get(i).length();
            }

        }
        for (int i = 0; i < linked.size(); i++) {
            if (linked.get(i).length() == maxLength){
                System.out.println(maxLength);
                System.out.println(linked.get(i));
            }
        }
    }
}
