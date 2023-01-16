package lessons.lesson6;

public class BattleMain {
    public static void main(String[] args) {
        FieldGenerate fieldGenerate = new FieldGenerate(10,10);
        int [][] field = fieldGenerate.generate();

        FieldPrint fieldPrint = new FieldPrint(10);
        fieldPrint.printField(field);

        Game game = new Game(field);
        game.start();



    }
}
