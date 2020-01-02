package leecode.t155;

import java.util.PriorityQueue;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private PriorityQueue<Integer> priorityQueue = new PriorityQueue();
    private int min;

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); ;
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack();
    }

    public void push(int x) {
        priorityQueue.add(x);
        stack.add(x);
    }

    public void pop() {
        int top = stack.pop();
        priorityQueue.remove(top);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return (int) priorityQueue.peek();
    }
}
