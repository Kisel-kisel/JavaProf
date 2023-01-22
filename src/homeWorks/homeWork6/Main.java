package homeWorks.homeWork6;

import homeWorks.homeWork6.FieldGeneration;

//Создать поле игры
//Дать возможность игроку стрелять
//Создать базовую генерацию кораблей

public class Main {
    public static void main(String[] args) {

        FieldGeneration fieldGenerate = new FieldGeneration(10,10);
        int[][] field = fieldGenerate.generate();

        FieldPrinter fieldPrinter = new FieldPrinter(10);//не забыть переставить
        fieldPrinter.printField(field);

//        FieldGenerationTwo fieldGenerationTwo = new FieldGenerationTwo(10,10);
//        int[][] fieldTwo = fieldGenerationTwo.generateTwo();

        Game game = new Game(field,10,10);
        game.start();


    }
}
