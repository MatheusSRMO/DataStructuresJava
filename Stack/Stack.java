package DataStructures.Stack;
import DataStructures.LinkedList.LinkedList;

public class Stack<E> {
    private LinkedList<E> stack;

    public Stack() {
        this.stack = new LinkedList<>();
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
