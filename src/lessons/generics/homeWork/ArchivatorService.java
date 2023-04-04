package lessons.generics.homeWork;

import java.util.List;

public class ArchivatorService {
    public void take(List<? extends Archivator> takeList){

        for (Archivator archivator : takeList) {
            System.out.println(archivator);
        }
    }

    public void give(List<? super ZIPArchivator> zipaList){
        zipaList.add(new ZIPArchivator());
    }
}
