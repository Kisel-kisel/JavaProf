package homeWorks.homeWork6;

import java.util.Random;

public class FieldGeneration {
    private int length;
    private int width  ;

    public FieldGeneration(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int[][] generate() {
        Random random = new Random();
        int[][] field = new int[length][width];
        int maxShipsOne = 4;
        int countOfShipsOne = 0;
        int countOfShipsTwo = 0;
        int maxShipsTwo = 3;
//         || countOfShipsTwo <= maxShipsTwo
        while (countOfShipsOne <= maxShipsOne || countOfShipsTwo <= maxShipsTwo) {
            int a = random.nextInt(0,length);
            int b = random.nextInt(0,width);
            int c = random.nextInt(0,length);
            int d = random.nextInt(0,width);
            int c1 = c + 1;
            int d1 = d + 1;
//            && countOfShipsTwo < 1
            if (field[a][b] == 0 ) {
                field[a][b] = 1;
                field[c][d] = 2;
                field[c1][d] = 2;
                countOfShipsOne++;

            }else{
                field[c][d] = 2;
                field[c][d1] = 2;
            }
            countOfShipsTwo++;
        }

        return field;
    }
}
