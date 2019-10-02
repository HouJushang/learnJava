package datastructure.queue;


public class LinkedQueue<T> implements IQueue<T> {
    class Node {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(T data) {
            this.data = data;
        }
    }

    private Node firstNode;

    private Node lastNode;

    @Override
    public void enqueue(T entry) {
        Node newNode = new Node(entry);
        if(isEmpty()){
            firstNode = newNode;
        }else{
            lastNode.next = newNode;
        }
        lastNode = newNode;
    }

    @Override
    public T dequeue() {
        T result = null;
        if(firstNode != null) {
            result = firstNode.data;
            if(firstNode.next == null){
                firstNode = null;
                lastNode = null;
            }else{
                firstNode = firstNode.next;
            }
        }
        return result;
    };

    @Override
    public T getFront() {
        T result = null;
        if(firstNode != null){
            result = firstNode.data;
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
    }
}
