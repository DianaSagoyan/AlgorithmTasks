package tasks;

import java.util.LinkedList;

public class LongestValidParentheses2 {
    public static void main(String[] args) {
        String str = "()(())";
//        String str = "(()";
//        String str = ")()())";

        System.out.println(longestValidParentheses(str));
    }

    public static int longestValidParentheses(String str){
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(-1);
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                stack.push(i);
            else {
                stack.pop();
                if (stack.isEmpty())  // catches the index of the last invalid sign
                    stack.push(i);
                else                // there is a valid series
                    result = Math.max(result, i - stack.peek());
            }
        }
        return result;
    }

}
