package lessons.lesson6;

import java.util.Arrays;

public class FieldPrint {

    private  int length;

    public FieldPrint(int length) {
        this.length = length;
    }

    public void printField(int[][] field){
            for (int i = 0; i < length; i++) {
                System.out.println(Arrays.toString(field[i]));
            }
    }
}
