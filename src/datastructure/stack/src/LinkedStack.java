package datastructure.stack.src;


import java.util.EmptyStackException;

public class LinkedStack<T> implements IStack<T> {
    private Node topNode;

    private int numberOfEntries = 0;

    class Node {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    @Override
    public void push(T entry) {
        topNode = new Node(entry, topNode);
        numberOfEntries++;
    }

    @Override
    public T pop() {
        if(isEmpty())
            throw new EmptyStackException();
        T result = topNode.data;
        topNode = topNode.next;
        return result;
    }

    @Override
    public T peek() {
        if(isEmpty())
            throw new EmptyStackException();
        return topNode.data;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void clear() {
        topNode = null;
    }
}
