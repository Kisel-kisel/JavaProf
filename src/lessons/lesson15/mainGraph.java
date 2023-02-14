package lessons.lesson15;

import java.util.ArrayList;
import java.util.List;

public class mainGraph {
    public static void main(String[] args) {
        Node sleep = new Node(null, null, "Sleep");
        Node work = new Node(null, null, "Work");
        Node rest = new Node(null, null, "Rest");
        Node eat = new Node(null, null, "Eat");

        sleep.setRight(work);
        work.setRight(rest);
        rest.setRight(eat);
        eat.setRight(sleep);



        NodeGraphSecond sleep2 = new NodeGraphSecond(null, "Sleep");
        NodeGraphSecond work2 = new NodeGraphSecond(null, "Work");
        NodeGraphSecond rest2 = new NodeGraphSecond(null, "Rest");
        NodeGraphSecond eat2 = new NodeGraphSecond(null, "Eat");
        NodeGraphSecond ill2 = new NodeGraphSecond(null, "Ill");


        List<NodeGraphSecond> linksFromSleep = new ArrayList<>();
        linksFromSleep.add(work2);
        linksFromSleep.add(rest2);
        linksFromSleep.add(eat2);
        linksFromSleep.add(sleep2);
        sleep2.setLinks(linksFromSleep);

        List<NodeGraphSecond> linksFromWork = new ArrayList<>();
        linksFromWork.add(rest2);
        work2.setLinks(linksFromWork);


        List<NodeGraphSecond> linksFromRest = new ArrayList<>();
        linksFromRest.add(eat2);
        linksFromRest.add(ill2);
        rest2.setLinks(linksFromRest);

        List<NodeGraphSecond> linksFromEat = new ArrayList<>();
        linksFromEat.add(sleep2);
        eat2.setLinks(linksFromEat);

        NodeGraphSecond now = sleep2.getLinks().get(2);
        now = now.getLinks().get(0);
        System.out.println(sleep2.getLinks().get(2));


    }
}
