package book.datastructure.bag.src;

public interface IBag<T> {
    int getSize();

    boolean isEmpty();

    void add(T t);

    T remove();

    T remove(T t);

    void clear();

    int getFrequencyOf(T t);

    boolean contains(T t);

    T[] toArray();

}
