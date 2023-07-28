package DataStructures.Stack;
import DataStructures.DoublyLinkedList.DoublyLinkedList;

public class Stack<E> {
    private DoublyLinkedList<E> stack;

    public Stack() {
        this.stack = new DoublyLinkedList<>();
    }

    // Complexity: O(1)
    public void push(E data) {
        this.stack.addFront(data);
    }

    // Complexity: O(1)
    public E pop() {
        return this.stack.removeFront();
    }

    // Complexity: O(1)
    public E peek() {
        return this.stack.getFront();
    }
    
    // Complexity: O(1)
    public Boolean isEmpty() {
        return this.stack.isEmpty();
    }
}
