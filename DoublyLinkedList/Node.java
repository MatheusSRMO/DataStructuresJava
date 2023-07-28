package DataStructures.DoublyLinkedList;

public class Node<E> {
    public E data;
    private Node<E> next;
    private Node<E> prev;

    public Node(E data, Node<E> prev, Node<E> next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setNext(Node<E> nextNode) {
        this.next = nextNode;
    }

    public void setPrev(Node<E> prevNode) {
        this.prev = prevNode;
    }

    public E getData() {
        return this.data;
    }

    public Node<E> getNext() {
        return this.next;
    }

    public Node<E> getPrev() {
        return this.prev;
    }
}
