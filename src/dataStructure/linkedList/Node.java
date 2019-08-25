package dataStructure.linkedList;

public class Node<T> {
    T t;
    Node next;

    public Node(T t, Node next){
        this.t = t;
        this.next = next;
    }

    public Node() {
        this(null, null);
    }

    public Node(T t){
        this(t, null);
    }
}
