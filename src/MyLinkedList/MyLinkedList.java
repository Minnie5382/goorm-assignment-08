package MyLinkedList;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{
    Node<T> head;

    public MyLinkedList() {
        head = new Node<T>();
    }

    public void add(T data) {
        Node<T> node;
        Node<T> newNode = new Node<>(data); // 데이터 넣은 새 노드 생성.
        if (head.isLastNode()) // 요소가 하나도 없을 경우
            head.setNext(newNode);
        else {// 하나 이상의 요소가 있을 경우
            node = head.getNext(); // 첫번째 노드
            while (true) {
                if (node.isLastNode()) { // 해당 노드가 마지막 노드이면
                    node.setNext(newNode);
                    break;
                } else {
                    node = node.getNext();
                }
            }
        }

    }

    public T get(int idx) {
        Node<T> node = head.getNext();
        for (int i = 0; i < idx; i++) {
            if (node == null)
                System.out.println("Error: index가 범위를 벗어납니다!");
            node = node.getNext();
        }
        return node.getData();
    }

    public Node<T> getNode(int idx) {
        Node<T> node = head.getNext();
        for (int i = 0; i < idx; i++) {
            if (node == null)
                System.out.println("Error: index가 범위를 벗어납니다!");
            node = node.getNext();
        }
        return node;
    }

    public void delete(int idx) {
        Node<T> node = head.getNext();
        if (idx == 0) head.setNext(this.getNode(idx + 1)); // idx = 0일때
        else if (getNode(idx).isLastNode()) // idx가 마지막 인덱스일 때
            getNode(idx - 1).setNext(null);
        else {
            Node<T> prevNode = getNode(idx - 1);
            Node<T> nextNode = getNode(idx + 1);
            prevNode.setNext(nextNode);
        }


    }

    @Override
    public Iterator<T> iterator() {
        return new myIterator();
    }


    private class myIterator implements Iterator<T> {
        Node<T> current = head;
        @Override
        public boolean hasNext() {
            return !current.isLastNode();
        }

        @Override
        public T next() {
            current = current.getNext();
            return current.getData();
        }
    }

}