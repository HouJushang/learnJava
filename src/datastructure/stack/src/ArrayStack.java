package datastructure.stack.src;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> implements IStack<T> {

    private T[] stack;
    private int topIndex = 0;
    private static final int CAPACITY = 20;
    private static final int MAX_CAPACITY = 10000;
    private boolean initialized = false;

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int size) {
        if(size >= MAX_CAPACITY){
            throw new IllegalStateException("Attempt to create a stack whose capacity exceeds allowed maximum");
        }
        this.stack = (T[]) new Object[size];
        initialized = true;
    }

    @Override
    public void push(T entry) {
        checkIniaitlized();
        if(this.isArrayFull()){
            this.doubleCapacity();
        }
        stack[topIndex] = entry;
        topIndex ++;
    }

    @Override
    public T pop() {
        if(isEmpty())
            throw new EmptyStackException();
        T result = stack[topIndex - 1];
        stack[topIndex] = null;
        topIndex --;
        return result;
    }

    @Override
    public T peek() {
        if(isEmpty())
            throw new EmptyStackException();
        return stack[topIndex - 1];
    }



    @Override
    public void clear() {
        if(!isEmpty())
            pop();
    }


    @Override
    public boolean isEmpty() {
        return topIndex <= 0;
    }


    private void doubleCapacity() {
        int newCapacity = stack.length * 2;
        if(newCapacity > MAX_CAPACITY)
            throw new IllegalStateException("Attempt to create a stack whose capacity exceeds allowed maximum");
        stack = Arrays.copyOf(stack, newCapacity);
    }

    private Boolean isArrayFull() {
        return this.topIndex >= stack.length;
    }

    private void checkIniaitlized() {
        if(!initialized) {
            throw new SecurityException("ArrayStack object is not iniaitlized prpperly.");
        }
    }
}
