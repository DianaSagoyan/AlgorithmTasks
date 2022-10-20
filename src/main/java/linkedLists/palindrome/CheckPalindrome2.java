package linkedLists.palindrome;

import linkedLists.merge_2sorted_linkedlists.ListNode;

import java.util.Stack;

public class CheckPalindrome2 {
    public static void main(String[] args) {
        NodeList node1 = new NodeList(1);
        NodeList node2 = new NodeList(2);
        NodeList node3 = new NodeList(3);
        NodeList node4 = new NodeList(2);
        NodeList node5 = new NodeList(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println(isPalindrome(node1));
    }

    public static boolean isPalindrome(NodeList head){
        Stack<Integer> stack = new Stack<>();
        NodeList current = head;

        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        current = head;

        while (current != null){
            if(current.val != stack.peek()) return false;
            stack.pop();
            current = current.next;
        }

        return true;
    }
}
