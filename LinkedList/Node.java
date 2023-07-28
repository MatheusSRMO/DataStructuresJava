package DataStructures.LinkedList;

public class Node<E> {
    public E data;
    public Node<E> next;

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setNext(Node<E> nextNode) {
        this.next = nextNode;
    }

    public E getData() {
        return this.data;
    }

    public Node<E> getNext() {
        return this.next;
    }
}
