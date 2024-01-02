package MyLinkedList;

public class MyStack<T> extends MyLinkedList<T>{
    public Node<T> pop() {
        int lastIdx = getLength()-1;
        Node<T> node = getNode(lastIdx);
        System.out.println(node.getData());
        delete(lastIdx);

        return node;
    }

    private int getLength() {
        int index = 0;
        Node<T> current = head;

        while (true) {
            if (current.isLastNode()) return index;
            else {
                current = current.getNext();
                index++;
            }
        }
    }


}
