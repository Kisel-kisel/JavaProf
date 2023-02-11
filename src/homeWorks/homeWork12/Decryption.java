package homeWorks.homeWork12;

import java.util.Stack;

public class Decryption {
    public static void decryption(Stack takeStack,Stack forWorkStack, Stack finishStack) {
        char[] charArray = new char[5];
        int size = 0;
        for (int i = takeStack.size(); i > 0; i--) {
            char symbol = (char) takeStack.pop();
            charArray[size] = symbol;
            size++;
            if (charArray[charArray.length - 1] != 0) {
                for (int j = charArray.length - 1; j > -1; j--) {
                    char symbol1 = charArray[j];
                    forWorkStack.push(symbol1);
                    charArray[j] = 0;
                    size--;
                }
            }
        }
        String stri = "";
        for (int i = forWorkStack.size(); i > 0; i--) {
            char symbol = (char) forWorkStack.pop();
            finishStack.push(symbol);
            stri += symbol;

        }
        System.out.println(finishStack);
        System.out.println(stri);
    }
}
