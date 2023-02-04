package lessons.lesson11;

import java.util.*;

public class MainMap {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
////        List<String> list = new ArrayList<>();
//        Map<String, Integer> map = new HashMap<>();
//
////        list.add("Sidorow");
//        map.put("Sidorow", 5);
////        map.put("Sidorow", 2);
//        map.put("Ivanov", 2);
//
//
//        if (map.containsKey(name)){
//            Integer mark = map.get(name);
//            System.out.println(mark);
//        }else {
//            System.out.println("no");
//        }
//
//        Set<String> set = map.keySet();
//        System.out.println(set);
//
//        Collection <Integer> collection = map.values();
//
//        for (Integer integer : collection) {
//            System.out.println(integer);
//
//        }

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Map<String, Integer> mapCity = new HashMap<>();
        mapCity.put("Darmstard", 150000);
        mapCity.put("Francfurt", 1700000);
        mapCity.put("Berlin", 2000000);
        mapCity.put("Garmish", 25000);
        mapCity.put("Munchen", 800000);

        if (mapCity.containsKey(name)){
            Integer populathion = mapCity.get(name);
            System.out.println(populathion);
        }else {
            System.out.println("no");
        }


//        Collection <Integer> collection = mapCity.values();
//
//
        int zero = 0;
//        for (Integer integer : collection) {
//            zero += integer / mapCity.size();
//        }
//        System.out.println(zero);
        Set<String> set = mapCity.keySet();
        for (String s : set) {
            zero += mapCity.get(s)/mapCity.size();
        }
        System.out.println(zero);



    }
}
