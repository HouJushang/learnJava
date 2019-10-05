package datastructure.list;

import java.util.Arrays;
import java.util.EmptyStackException;

// todo 优化throw
public class ArrayList<T> implements  IList<T>{
    private T[] list;
    private int numberOfEntries = 0;
    private static final int CAPACITY = 20;
    private static final int MAX_CAPACITY = 10000;

    public ArrayList() {
        this(CAPACITY);
    }

    public ArrayList(int size) {
        if(size >= MAX_CAPACITY){
            throw new IllegalStateException("Attempt to create a arrayList whose capacity exceeds allowed maximum");
        }
        this.list = (T[]) new Object[size];
    }

    @Override
    public void add(T entry) {
        list[numberOfEntries++] = entry;
        if(isArrayFull()) {
            doubleCapacity();
        }
    }

    @Override
    public void add(int index, T entry) {
        if(checkIndex(index))
            throw new Error("add error");
        makeRoom(index);
        list[index] = entry;
    }

    @Override
    public void remove(int index) {
        if(checkIndex(index))
            throw new Error("remove error");
        for (int i = index; i < numberOfEntries - 1; i++) {
            list[i] = list[i + 1];
        }
        numberOfEntries--;
    }

    @Override
    public void set(int index, T entry) {
        if(checkIndex(index))
            throw new Error("set error");
        list[index] = entry;
    }

    @Override
    public T get(int index) {
        if(checkIndex(index))
            throw new Error("get error");
        return list[index];
    }

    @Override
    public boolean contains(Object entry) {
        boolean found = false;
        int currentIndex = 0;
        while (!found && currentIndex < numberOfEntries){
            if(list[currentIndex++].equals(entry)) found = true;
        }
        return found;
    }

    @Override
    public int size() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public T[] toArray() {
        T[] result = (T[]) new Object[this.numberOfEntries];
        for (int i = 0; i < result.length; i++) {
            result[i] = this.list[i];
        }
        return result;
    }

    private void makeRoom(int index) {
        for (int i = numberOfEntries; i > index; i--) {
            list[i] = list[i - 1];
        }
        numberOfEntries++;
    }

    private boolean checkIndex(int index) {
        return index < numberOfEntries && index >= 0;
    }

    private Boolean isArrayFull() {
        return this.numberOfEntries >= list.length;
    }

    private void doubleCapacity() {
        int newCapacity = list.length * 2;
        if(newCapacity > MAX_CAPACITY)
            throw new IllegalStateException("Attempt to create a arraylist whose capacity exceeds allowed maximum");
        list = Arrays.copyOf(list, newCapacity);
    }
}
