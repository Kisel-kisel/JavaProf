package homeWorks.homeWork12;

import java.util.Random;
import java.util.Stack;

import static homeWorks.homeWork12.Encryption.encryption;
import static homeWorks.homeWork12.Decryption.decryption;

public class Main {
    public static void main(String[] args) {
        Encryption encryption = new Encryption();
        Stack<Character> encryptionStack = new Stack<>();
        String string = "гороДрд еи!яьзугалБ ярадоишав ирп ммаремоп я ,алян отч м йом дотен лыбину еасревмыньл.";
        encryption(string,encryptionStack);

        Decryption example = new Decryption();
        Stack<Character> stackForTime = new Stack<>();
        Stack<Character> decryption = new Stack<>();
        decryption(encryptionStack, stackForTime,decryption);

    }
}


