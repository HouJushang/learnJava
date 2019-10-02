package datastructure.queue;

public interface IQueue<T> {
    public void enqueue(T entry);

    public T dequeue();

    public T getFront();

    public boolean isEmpty();

    public void clear();
}
