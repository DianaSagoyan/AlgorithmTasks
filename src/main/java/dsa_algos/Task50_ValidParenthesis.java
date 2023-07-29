package dsa_algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Task50_ValidParenthesis {
    public static void main(String[] args) {
        //Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
        //
        //An input string is valid if:
        //
        //Open brackets must be closed by the same type of brackets.
        //Open brackets must be closed in the correct order.
        //Every close bracket has a corresponding open bracket of the same type.

        String s = "(){}[]";
        System.out.println(isValidParentheses(s));
    }

    public static boolean isValidParentheses(String str){
        if(str.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for(char ch: str.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '[') stack.push(ch);
            else if(ch == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
            else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{') stack.pop();
            else if(ch == ']' && !stack.isEmpty() && stack.peek() == '[') stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
}
