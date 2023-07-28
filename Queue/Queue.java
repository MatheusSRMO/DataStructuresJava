package DataStructures.Queue;
import DataStructures.DoublyLinkedList.DoublyLinkedList;

public class Queue<E> {

    public DoublyLinkedList<E> queue;

    public Queue() {
        this.queue = new DoublyLinkedList<>();
    }

    // Complexity: O(1)
    public void push(E data) {
        this.queue.addBack(data);
    }

    // Complexity: O(1)
    public E pop() {
        return this.queue.removeFront();
    }

    // Complexity: O(1)
    public E peek() {
        return this.queue.getFront();
    }

    // Complexity: O(1)
    public Boolean isEmpty() {
        return this.queue.isEmpty();
    }
    
}
