package homeWorks.homeWork14;

import java.util.ArrayList;
import java.util.List;

public class MainForGraph {
    public static void main(String[] args) {
        NodeGraph а = new NodeGraph(null,"а");
        NodeGraph б = new NodeGraph(null,"б");
        NodeGraph в = new NodeGraph(null,"в");
        NodeGraph г = new NodeGraph(null,"г");
        NodeGraph д = new NodeGraph(null,"д");
        NodeGraph е = new NodeGraph(null,"е");
        NodeGraph ж = new NodeGraph(null,"ж");
        NodeGraph з = new NodeGraph(null,"з");
        NodeGraph и = new NodeGraph(null,"и");
        NodeGraph к = new NodeGraph(null,"к");

        List<NodeGraph> listА = new ArrayList<>();
        listА.add(б);
        listА.add(в);
        listА.add(г);
        listА.add(д);
        а.setLinks(listА);

        List<NodeGraph> listБ = new ArrayList<>();
        listБ.add(е);
        listБ.add(в);
        б.setLinks(listБ);

        List<NodeGraph> listВ = new ArrayList<>();
        listВ.add(ж);
        в.setLinks(listВ);

        List<NodeGraph> listГ = new ArrayList<>();
        listГ.add(в);
        listГ.add(з);
        г.setLinks(listГ);

        List<NodeGraph> listД = new ArrayList<>();
        listД.add(г);
        listД.add(и);
        д.setLinks(listД);

        List<NodeGraph> listЕ = new ArrayList<>();
        listЕ.add(к);
        е.setLinks(listЕ);

        List<NodeGraph> listЖ = new ArrayList<>();
        listЖ.add(к);
        listЖ.add(з);
        ж.setLinks(listЖ);

        List<NodeGraph> listЗ = new ArrayList<>();
        listЗ.add(к);
        з.setLinks(listЗ);

        List<NodeGraph> listИ = new ArrayList<>();
        listИ.add(к);
        и.setLinks(listИ);

    }
}
