package lessons.lesson9;

import java.util.*;

public class MainSet {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        List<String> list = new ArrayList<>();
//
//        list.add("One");
//        list.add("One");
//        list.add("One");
//
//        set.add("One");
//        set.add("One");
//        set.add("One");
//
//        int size = set.size();
//
//        boolean answer = set.contains("One");//is it in set or not
//
//        System.out.println(answer);
//
//        System.out.println(list);
//        System.out.println(set);

//        Set<Integer> integers = new HashSet<>();
//        for (int i = 0; i < 1000; i++) {
//            long start = System.currentTimeMillis();
//            integers.add(i);
//            long end = System.currentTimeMillis();
//            System.out.println(start);
//        }
//        System.out.println(integers);
//        }

//        Scanner scanner = new Scanner(System.in);
//        int first = scanner.nextInt();
//        int second = scanner.nextInt();
//        int third = scanner.nextInt();
//        Set<Integer> integers = new HashSet<>();
//        integers.add(first);
//        integers.add(second);
//        integers.add(third);
//
//
//        if (integers.size() == 1) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }

        int a = 5;
        int b = 6;
        int c = 7;
        Set<Integer> inter = new HashSet<>();
        Iterator iterator = inter.iterator();

        inter.add(a);
        inter.add(b);
        inter.add(c);

        for (Integer integer : inter) {
            System.out.println(integer);
        }


    }
    }

