package leecode.t155;

import java.util.PriorityQueue;
import java.util.Stack;

//利用辅助栈
public class MinStack2 {
    private Stack<Integer> stack;
    private Stack<Integer> helper;

    public static void main(String[] args) {
        MinStack2 minStack = new MinStack2();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); ;
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }

    /** initialize your data structure here. */
    public MinStack2() {
        helper = new Stack();
        stack = new Stack();
    }

    public void push(int x) {
        stack.add(x);
        if(helper.isEmpty() || x < helper.peek()){
            helper.add(x);
        }else{
            helper.add(helper.peek());
        }
    }

    public void pop() {
        stack.pop();
        helper.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return helper.peek();
    }
}
