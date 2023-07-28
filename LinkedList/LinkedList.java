package DataStructures.LinkedList;

public class LinkedList<E> {

    private Node<E> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Complexity: O(1)
    public void addFront(E data) {
        Node<E> newNode = new Node<>(data, this.head);
        this.head = newNode;
        this.size++;
    }
    
    // Complexity: O(n)
    public void addBack(E data) {
        Node<E> newNode = new Node<>(data, null);
        if (this.head == null) {
            this.head = newNode;
        }
        else {
            Node<E> current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        this.size++;
    }

    // Complexity: O(n)
    public void addAt(E data, int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }
        else if (index == 0) {
            this.addFront(data);
        }
        else if (index == this.size) {
            this.addBack(data);
        }
        Node<E> current = this.head;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        Node<E> newNode = new Node<>(data, current.getNext());
        current.setNext(newNode);
        this.size++;
    }

    // Complexity: O(1)
    public E removeFront() {
        if (this.head == null) {
            throw new NullPointerException();
        }
        Node<E> removedNode = this.head;
        this.head = this.head.getNext();
        this.size--;
        return removedNode.getData();
    }

    // Complexity: O(n)
    public E removeBack() {
        if (this.head == null) {
            throw new NullPointerException();
        }
        else if (this.head.getNext() == null) {
            Node<E> removedNode = this.head;
            this.head = null;
            this.size--;
            return removedNode.getData();
        }
        Node<E> current = this.head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        Node<E> removedNode = current.getNext();
        current.setNext(null);
        this.size--;
        return removedNode.getData();
    }

    // Complexity: O(n)
    public E removeAt(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        else if (index == 0) {
            return this.removeFront();
        }
        else if (index == this.size - 1) {
            return this.removeBack();
        }

        Node<E> current = this.head;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        Node<E> removedNode = current.getNext();
        current.setNext(current.getNext().getNext());
        this.size--;
        return removedNode.getData();
    }

    // Complexity: O(1)
    public E getFront() {
        if (this.head == null) {
            throw new NullPointerException();
        }
        return this.head.getData();
    }

    // Complexity: O(1)
    public Boolean isEmpty() {
        return this.head == null;
    }

    // Complexity: O(n)
    public void printList() {
        System.out.print("[");
        Node<E> current = this.head;
        while (current != null) {
            System.out.print(current.getData());
            current = current.getNext();
            if (current != null) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
}
