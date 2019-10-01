package datastructure.bag.src;

public class LinkedBag<T> implements IBag<T> {
    private Node firstNode;

    class Node {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    @Override
    public int getCurrentSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Boolean add(T newEntry) {
        Node newNode = new Node(newEntry, firstNode);
        return true;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public T remove(Object o) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getFrequencyOf(Object o) {
        return 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public T[] toArray() {
        return (T[])(new Object[0]);
    }
}
