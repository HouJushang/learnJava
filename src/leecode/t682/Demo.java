package leecode.t682;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        calPoints(new String[]{"5","-2","4","C","D","9","+","+"});
    }

    public static int calPoints(String[] ops) {
        Stack<Integer> resultStack = new Stack<>();
        for (String op : ops) {
            if(op.equals("+")){
                resultStack.add(resultStack.peek() + resultStack.get(resultStack.size() - 2));
            }else if(op.equals("D")){
                resultStack.add(resultStack.peek()*2);
            }else if(op.equals("C")){
                resultStack.pop();
            }else{
                resultStack.add(Integer.valueOf(op));
            }
        }
        int result = 0;
        for(int item : resultStack){
            result += item;
        }

        return result;
    }

    // 官方
    public static int calPonints(String[] ops){
        Stack<Integer> stack = new Stack();

        for(String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        int ans = 0;
        for(int score : stack) ans += score;
        return ans;
    }
}
