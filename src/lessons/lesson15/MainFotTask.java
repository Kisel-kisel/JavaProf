package lessons.lesson15;

import java.util.ArrayList;
import java.util.List;

public class MainFotTask {
    public static void main(String[] args) {
        NodeGraphSecond first = new NodeGraphSecond(null, "first");
        NodeGraphSecond second = new NodeGraphSecond(null, "second");
        NodeGraphSecond third = new NodeGraphSecond(null, "third");
        NodeGraphSecond fouth = new NodeGraphSecond(null, "fouth");
        NodeGraphSecond fifth = new NodeGraphSecond(null, "fifth");
        NodeGraphSecond sixth = new NodeGraphSecond(null, "sixth");

        List<NodeGraphSecond> linksFirst = new ArrayList<>();
        linksFirst.add(second);
        linksFirst.add(third);
        first.setLinks(linksFirst);

        List<NodeGraphSecond> linksThird = new ArrayList<>();
        linksThird.add(fouth);
        linksThird.add(fifth);
        third.setLinks(linksThird);

        List<NodeGraphSecond> linksFifth = new ArrayList<>();
        linksFifth.add(sixth);
        fifth.setLinks(linksFifth);

        List<NodeGraphSecond> linksSixth = new ArrayList<>();
        linksSixth.add(third);
        sixth.setLinks(linksSixth);


    }
}
