package dsa_algos;

import java.util.Stack;

public class Task49_AddTwoNumbers2 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(7);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(3);


        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        node5.next = node6;
        node6.next = node7;

        System.out.println(sumOfTwoNumbers(node1, node5));
    }

    public static ListNode sumOfTwoNumbers(ListNode l1, ListNode l2){

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (l1 != null){
            stack1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode result = null;

        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0 ){

            int sum = carry;

            if(!stack1.isEmpty()) sum += stack1.pop();
            if(!stack2.isEmpty()) sum += stack2.pop();

            ListNode temp = new ListNode(sum % 10);
            temp.next = result;
            result = temp;

            carry = sum / 10;
        }

        return ListNode.print(result);
    }
}
