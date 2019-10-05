package datastructure.list;

public interface IList<T> {
    public void add(T entry);
    public void add(int index, T entry);
    public void remove(int index);
    public void set(int index, T entry);
    public T get(int index);
    public boolean contains(Object entry);
    public int size();
    public boolean isEmpty();
    public T[] toArray();
}
