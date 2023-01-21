package homeWorks.homeWork6;

import java.util.Random;

public class FieldGenerationTwo {
    private int length;
    private int width;

    public FieldGenerationTwo(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int[][] generateTwo(){
        Random random = new Random();
        int[][] field = new int[length][width];
        int maxShipsTwo = 3;
        int countOfShips = 0;
        while (countOfShips < maxShipsTwo) {
            int a = random.nextInt(0, length);
            int b = random.nextInt(0, width);
            int a1 = a + 1;
            int b1 = b + 1;

            if (field[a][b] == 0 && countOfShips < 1) {
                field[a][b] = 2;
                field[a1][b]=2;


            }
            else {
                field[a][b] = 2;
                field[a][b1]=2;
            }
            countOfShips++;
        }
        return field;

    }
}
