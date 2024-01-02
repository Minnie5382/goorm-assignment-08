package MyLinkedList;

public class MyQueue<T> extends MyLinkedList<T> {
    public Node<T> pop() {
        Node<T> node = getNode(0);
        System.out.println(node.getData());
        delete(0);

        return node;
    }
}
