package lessons.lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();


        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        List<Integer> answer = new ArrayList<>();

        for (Integer integer : list) {
            stack.push(integer);
        }
        for (int i = 0; i <list.size() ; i++) {
            int element = stack.pop();
            answer.add(element);
        }

        System.out.println(answer);
        //Лист, изменить порядок элементов (наоборот)- перевернуть лист

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(4);
//        list.add(10);
//
//        List<Integer> answer = new ArrayList<>();
//
//        for (int i = list.size() - 1; i >= 0; i--) {
//            int element = list.get(i);
//            answer.add(element);
//        }
//
//        System.out.println(list);
//        System.out.println(answer);

//        stack.add(1);
//        stack.add(5);
//        stack.add(10);
//        stack.push(28);
//        System.out.println(stack.peek());// peek смотрит на элемент
//        System.out.println(stack.peek());
//
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.pop());
    }
}
