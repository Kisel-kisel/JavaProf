package lessons.generics.homeWork;

public class RARArchivator extends Archivator{

    @Override
    public void archive(String str) {
        System.out.println(str + "archive");
    }

    @Override
    public void dearchive(String str) {
        System.out.println(str + "dearchive");
    }
}
