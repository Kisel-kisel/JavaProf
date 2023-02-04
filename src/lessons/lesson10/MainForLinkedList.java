package lessons.lesson10;

public class MainForLinkedList {
    public static void main(String[] args) {
        LinkedListImplementation linkedList = new LinkedListImplementation();
        linkedList.add(7);
        linkedList.add(10);

        System.out.println(linkedList.head);
        System.out.println(linkedList.head.right);
        System.out.println(linkedList.head.right.right);

    }
}
