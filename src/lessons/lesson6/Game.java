package lessons.lesson6;

import java.util.Scanner;

public class Game {

    private int[][] field;

    public Game(int[][] field) {
        this.field = field;
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();

//            if(first < 10 && second < 10 && first >= && second >= 0){
//                int shot = field[first][second];
//            }else{
//                System.out.println();
//            }

            int shoot = field[first][second];

            if(shoot == 0){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
        }
        }



}
