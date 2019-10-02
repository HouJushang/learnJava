package datastructure.queue;

import java.util.EmptyStackException;

// 带一个空位置的循环数组实现队列
public class ArrayQueue<T> implements IQueue<T> {
    private T[] queue;
    private int frontIndex;
    private int backIndex;
    private static final int CAPACITY = 20;
    private static final int MAX_CAPACITY = 10000;
    private boolean initialized = false;

    public ArrayQueue() {
        this(CAPACITY);
    }

    public ArrayQueue(int size) {
        if(size >= MAX_CAPACITY){
            throw new IllegalStateException("Attempt to create a bag whose capacity exceeds allowed maximum");
        }
        this.queue = (T[]) new Object[size + 1];
        frontIndex = 0;
        backIndex = size;
        initialized = true;
    }

    @Override
    public void enqueue(T entry) {
        checkIniaitlized();
        if(arrayIsFull()){
            checkCapacity();
            T[] newQueue = (T[]) new Object[queue.length * 2];
            for (int i = 0; i < queue.length - 1; i++) {
                newQueue[i] = queue[frontIndex++ % queue.length];
            }
            frontIndex = 0;
            backIndex = queue.length - 2;
            queue = newQueue;
        }

        queue[++backIndex] = entry;
        backIndex = backIndex%queue.length;
    }

    @Override
    public T dequeue() {
        checkIniaitlized();
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T result = queue[frontIndex];
        queue[frontIndex++] = null;
        return result;
    }

    @Override
    public T getFront() {
        checkIniaitlized();
        if(isEmpty())
            throw new EmptyStackException();
        return queue[frontIndex];
    }

    @Override
    public boolean isEmpty() {
        return frontIndex == (backIndex + 1) % queue.length;
    }

    @Override
    public void clear() {

    }

    private boolean arrayIsFull() {
        return frontIndex == (backIndex + 2) % queue.length;
    }

    private void checkIniaitlized() {
        if(!initialized) {
            throw new SecurityException("ArrayBag object is not iniaitlized prpperly.");
        }
    }

    private void checkCapacity() {
        int newCapacity = queue.length * 2;
        if(newCapacity > MAX_CAPACITY)
            throw new IllegalStateException("Attempt to create a queue whose capacity exceeds allowed maximum");
    }

}
