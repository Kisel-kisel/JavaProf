package homeWorks.homeWork13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static homeWorks.homeWork13.Method.*;

public class Main {
    public static void main(String[] args) {
        Method method = new Method();
        Scanner scanner = new Scanner(System.in);
        List<Integer> tremors = new ArrayList<>();
        tremors.add(8);
        tremors.add(6);
        tremors.add(3);
        tremors.add(5);
        tremors.add(4);
        tremors.add(1);
        tremors.add(2);
        tremors.add(5);
        tremors.add(2);
        setAlarm(scanner.nextInt());
        resualt(tremors);
        }
    }

