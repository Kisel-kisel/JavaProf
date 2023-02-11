package homeWorks.homeWork13;

import java.util.List;


public class Method {
    private static List<Integer> list;
    private static int alarm;

    public static void setAlarm(int alarm) {
        Method.alarm = alarm;
    }
    private static int counter = 0;
    private static final int speshialNumber = -97;
    public static void resualt(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>3){
                counter++;
            }
        }
        if (alarm == speshialNumber && counter > 4) {
            System.out.println("Can be tremors! It was " + counter + " earthquakes more then 3 points!");
    }
    }
}
