package leecode.t42;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int result = 0;
        Stack<Integer> wrapStack = new Stack<>();

        for (int i = 0; i < height.length; i++) {
            if(wrapStack.isEmpty()){
                wrapStack.push(i);
            }else{
                while(!wrapStack.isEmpty() && height[wrapStack.peek()] < height[i]){
                    int min = height[wrapStack.peek()];
                    while (!wrapStack.isEmpty() && height[wrapStack.peek()] == min){
                        wrapStack.pop();
                    }
                    if(!wrapStack.isEmpty()){
                        result += (Math.min(height[i], height[wrapStack.peek()]) - min) * (i - wrapStack.peek() - 1);
                    }
                }
                wrapStack.push(i);
            }
        }
        System.out.println(result);
    }
}
