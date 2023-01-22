package homeWorks.homeWork6;

import java.util.Scanner;

public class Game {
    private int[][] field;
    private int length;
    private int width  ;

    public Game(int[][] field, int length, int width) {
        this.field = field;
        this.length = length;
        this.width = width;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int countOfPoints = 0;
        int countOfShipsKilledOne = 0;
        int countOfShipsKilledTwo = 0;

        for (int i = 0; i < 3; i++) {

            int first = scanner.nextInt();
            int second = scanner.nextInt();
            if (first < length && second < width && first >= 0 && second >= 0) {
                int shot = field[first][second];

                switch (shot){
                    case 0:
                        countOfPoints += 0;
                        System.out.println("Вы не попали");
                        break;
                    case 1:
                        countOfPoints += 4;
                        countOfShipsKilledOne++;
                        System.out.println("Вы попали в однопалубник!");
                        break;
                    case 2:
                        countOfPoints += 3;
                        countOfShipsKilledTwo++;
                        System.out.println("Вы попали в двупалубник!");

                }
//                if (shot == 0) {
//                    System.out.println("Вы не попали");
//                }
//                else {
//                    System.out.println("Вы попали");
//                    countOfShipsKilled++;
//                    countOfPoints += 4;
//                }
            }
            else {
                System.out.println("Что-то куда-то не туда");

            }


        }
        System.out.println("Ты заработал очков: " + countOfPoints);
        System.out.println("Ты уничтожил кораблей однопалубных: " + countOfShipsKilledOne);
        System.out.println("Ты уничтожил кораблей двупалубных: " + countOfShipsKilledTwo);

    }
}
