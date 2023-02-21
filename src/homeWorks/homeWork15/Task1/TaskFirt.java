package homeWorks.homeWork15.Task1;

import homeWorks.homeWork15.Task1.FuncInt;

public class TaskFirt implements FuncInt {

    @Override
    public void some(String[] strings) {
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            count++;
        }
        System.out.println(count);
    }
}
