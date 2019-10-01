package datastructure.bag.src;

public interface IBag<T> {
    int getCurrentSize();

    boolean isEmpty();

    Boolean add(T newEntry);

    T remove();

    Boolean remove(T t);

    void clear();

    int getFrequencyOf(T t);

    boolean contains(T t);

    T[] toArray();

}
