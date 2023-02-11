package homeWorks.homeWork12;

import java.util.Stack;

public class Encryption {
    public static void encryption(String string, Stack stack){
        char[] charArray = new char[5];
        int size = 0;
        String asStack = "";
        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            charArray[size] = symbol;
            size++;
            if (charArray[charArray.length - 1] != 0) {
                for (int j = charArray.length - 1; j > -1; j--) {
                    char symbol1 = charArray[j];
                    stack.push(symbol1);
                    asStack += symbol1;
                    charArray[j] = 0;
                    size--;
                }
            }
        }
        System.out.println(stack);
        System.out.println(asStack);
    }

}
