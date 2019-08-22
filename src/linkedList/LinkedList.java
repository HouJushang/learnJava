package linkedList;

public class LinkedList<T> {
    private int size;
    private Node dymmyHead;

    public LinkedList() {
       dymmyHead = new Node(null , null);
       size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(T t) {
        add(0, t);
    }

    public void add(int index, T t){
        if(index < 0 || index > size)
            throw new IllegalAccessException("index fail");
        Node prev = dymmyHead;
        for (int i = 0; i < index; i++){
            prev = prev.next;
        }
        prev.next = new Node(t, prev.next);
        size ++;
    }

    public void addLast(T t){
        this.add(size, t);
    }

    public T get(int index){
        Node cur = dymmyHead.next;
        for(int i = 0; i < index; i ++){
            cur = cur.next;
        }
        return cur.t;
    }

    public T getLast() {
        return get(size -1);
    }

    public void set(int index, T t){

    }


    private Node getNode(int index) {
        Node cur = dymmyHead.next;
        for(int i = 0; i < index; i ++){
            cur = cur.next;
        }
        return cur;
    }
}
