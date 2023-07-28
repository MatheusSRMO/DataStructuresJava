package DataStructures.Deque;
import DataStructures.DoublyLinkedList.DoublyLinkedList;

class Deque<E> {
    DoublyLinkedList<E> deque;

    public Deque() {
        this.deque = new DoublyLinkedList<>();
    }

    // Complexity: O(1)
    public void pushFront(E data) {
        this.deque.addFront(data);
    }

    // Complexity: O(1)
    public void pushBack(E data) {
        this.deque.addBack(data);
    }

    // Complexity: O(1)
    public E popFront() {
        return this.deque.removeFront();
    }

    // Complexity: O(1)
    public E popBack() {
        return this.deque.removeBack();
    }

    // Complexity: O(1)
    public E peekFront() {
        return this.deque.getFront();
    }

    // Complexity: O(1)
    public E peekBack() {
        return this.deque.getBack();
    }

    // Complexity: O(1)
    public Boolean isEmpty() {
        return this.deque.isEmpty();
    }

    // Complexity: O(n)
    public void print() {
        this.deque.printList();
    }
}
