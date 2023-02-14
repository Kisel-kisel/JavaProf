package lessons.lesson15;

public class Node {

    Node left;
    Node right;
    String value;

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(Node left, Node right, String value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public boolean hasNext(){
        return right != null;

    }

    @Override
    public String toString() {
        return "Node{" +
                ", value=" + value +
                '}';
    }
}
