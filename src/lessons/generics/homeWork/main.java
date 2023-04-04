package lessons.generics.homeWork;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        RARArchivator rarArchivator = new RARArchivator();
        ZIPArchivator zipArchivator = new ZIPArchivator();
        ArchivatorService archivatorService = new ArchivatorService();

        List <RARArchivator> rarList = new ArrayList<>();
        List <ZIPArchivator> zipList = new ArrayList<>();

        rarArchivator.archive("OneArchive");
        rarArchivator.dearchive("OneDe");

        zipArchivator.archive("SecondArchive");
        zipArchivator.dearchive("SecondDe");

        rarList.add(rarArchivator);
        zipList.add(zipArchivator);

        archivatorService.take(rarList);
        archivatorService.give(zipList);





    }
}
