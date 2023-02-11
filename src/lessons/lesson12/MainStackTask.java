package lessons.lesson12;

import java.util.Scanner;

public class MainStackTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int counter = 0;
        boolean answer = true;

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol == '(') {
                counter++;
            }
            if (symbol == ')') {
                counter--;
            }
            if (counter < 0) { //2
                answer = false;
            }
        }

        if (counter > 0) { //1
            answer = false;
        }


        System.out.println(answer);
    }
}
