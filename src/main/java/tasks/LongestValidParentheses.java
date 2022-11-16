package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String str = "()(())";
//        String str = "(()";
//        String str = ")()())";

        System.out.println(longestValidParentheses(str));
    }

    public static int longestValidParentheses(String str) {

        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
                stack.push(i);
            }

            else if (str.charAt(i) == ')' && stack.size() < 2 || str.charAt(i) == ')' && i == str.length() - 1) {
                int item = stack.pop();
                count += i - item + 1;
            } else if(str.charAt(i) == ')' && stack.size() > 1){
                stack.pop();
            }
        }
        return count;
    }
}