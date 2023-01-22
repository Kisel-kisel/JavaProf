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
        int maxShipsTwoOneSide = 2;
        int totalShips = 7;
        int total = 0;
        while (total < totalShips) {
            int a = random.nextInt(1,length-1);
            int b = random.nextInt(1,width-1);
            int c = random.nextInt(1,length-1);
            int d = random.nextInt(1,width-1);
            int c1 = c + 1;
            int d1 = d + 1;
            if (field[a][b] == 0 && countOfShipsOne < maxShipsOne ) {
                field[a][b] = 1;
                countOfShipsOne++;

            }else if (field[c][d] == 0 && field[c1][d] == 0 && countOfShipsTwo < maxShipsTwoOneSide){
                field[c][d] = 2;
                field[c1][d] = 2;
                countOfShipsTwo++;
            }else if(field[c][d] == 0 && field[c][d1] == 0){
                field[c][d] = 2;
                field[c][d1] = 2;
            }else {
                total--;
            }

            total++;
        }

        return field;
    }
}
