package lessons.lesson8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("Bye");
//        System.out.println(list);


        Iterator iterator = list.iterator();



//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());



//        String answer = "";
//
//        for (String s : list) {
//            System.out.println(s);
//            answer = answer + s;
//        }

        for (String s : list) {
            System.out.println(s);
        }

//        int index = 0;
//        for (String s : list) {
//            if(s.equals("hi")){
//                System.out.println("sd");
//                System.out.println(index);
//            }
//            index++;
//        }

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        for (int i = 0; i < list.size(); i++) {//only for list
//            System.out.println(list.get(i));
//        }
    }
}
