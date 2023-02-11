package lessons.lesson12;

import java.util.Scanner;
import java.util.Stack;

public class MainTask2 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        boolean answer = true;

        //[)

        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            if (symbol == '(') {
                stack.push('(');
            }

            if (symbol == '[') {
                stack.push('[');
            }

            if (symbol == ')') {
                if (!stack.empty()) {
                    char old = stack.pop();
                    if (old != '(') {
                        answer = false;
                    }
                }
                else {
                    answer = false;
                }
            }

            if (symbol == ']') {
                if (!stack.empty()) {
                    char old = stack.pop();
                    if (old != '[') {
                        answer = false;
                    }
                }
                else {
                    answer = false;
                }
            }
        }

        if (!stack.empty()) {
            answer = false;
        }

        System.out.println(answer);
    }
}
