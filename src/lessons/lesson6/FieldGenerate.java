package lessons.lesson6;

import java.util.Random;

public class FieldGenerate {

    private int length;
    private int width;

    public FieldGenerate(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int[][] generate(){

        Random random = new Random();
        int[][] field = new int[length][width];

        int countOfShipsOne = 0;
        int countOfShipsTwo = 0;
//        while (countOfShip < 4) {
//            int a = random.nextInt(0, length);
//            int b = random.nextInt(0, width);
//
//
//            if (field[a][b] == 0) {
//                field[a][b] = 1;
//                countOfShip++;
//            }
//        }

        for (int i = 0; i < 1; i++) {
            int a = random.nextInt(0,length);
            int b = random.nextInt(0,width);

            if (field[a][b] == 1){
                i--;
            }else{
                field[a][b] = 1;
            }

            field[a][b] = 1;
        }



        return field;
    }
}
