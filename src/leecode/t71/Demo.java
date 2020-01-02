package leecode.t71;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/../"));
    }

    public static String simplifyPath(String path) {

        String[] temp = path.split("/");
        Stack<String> strStack = new Stack<>();

        for (String item : temp){
            if(item.equals(".") || item.equals("")){
                continue;
            }
            if(item.equals("..")){
                if(strStack.isEmpty()) continue;
                strStack.pop();
                strStack.pop();
                continue;
            }
            strStack.add("/");
            strStack.add(item);
        }
        if(strStack.isEmpty()) return "/";

        return String.join("", strStack.toArray(new String[0]));
    }
}
