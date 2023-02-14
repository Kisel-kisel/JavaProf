package homeWorks.homeWork14;

import lessons.lesson15.NodeGraphSecond;

import java.util.List;

public class NodeGraph {
    List<NodeGraph> links;
    String value;

    public NodeGraph(List<NodeGraph> links, String value) {
        this.links = links;
        this.value = value;
    }

    public List<NodeGraph> getLinks() {
        return links;
    }

    public void setLinks(List<NodeGraph> links) {
        this.links = links;
    }
}
