package leecode.Valid_Parentheses;

import java.util.ArrayList;

class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stackSting = new ArrayList<Character>();
        String leftStr = "[{(";
        String righttStr = "]})";
        Boolean errBreak = false;
        for (int i =0; i<s.length(); i++){
            char item = s.charAt(i);
            if(leftStr.indexOf(item) >-1){
                stackSting.add(item);
            }else{
                int lastIndex = stackSting.size() -1;
                if(lastIndex < 0){
                    errBreak = true;
                    break;
                }
                if(stackSting.get(lastIndex).equals(leftStr.charAt(righttStr.indexOf(item)))){
                    stackSting.remove(stackSting.size() -1);
                }else{
                    break;
                }
            };
        }
        if(stackSting.size() > 0 || errBreak){
            return false;
        }else{
            return true;
        }
    }
}