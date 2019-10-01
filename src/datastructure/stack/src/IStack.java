package datastructure.stack.src;

public interface IStack<T> {
    public void push(T entry);

    public T pop();

    public T peek();

    public boolean isEmpty();

    public void clear();
}
