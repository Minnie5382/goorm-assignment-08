package MyLinkedList;

public class Node<T> {
    private Node<T> next;
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node() {
        this.data = null;
        this.next = null;
    }

    public Node(Node<T> node) {
        this.data = node.data;
        this.next = null;
    }

    public void setNext(Node<T> node) {
        this.next = node;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public boolean isLastNode() {
        return this.next == null;
    }

}
