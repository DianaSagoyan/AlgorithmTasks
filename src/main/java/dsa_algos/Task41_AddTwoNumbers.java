package dsa_algos;

public class Task41_AddTwoNumbers {
    public static void main(String[] args) {
        //You are given two non-empty linked lists representing two non-negative integers.
        // The digits are stored in reverse order, and each of their nodes contains a single digit.
        // Add the two numbers and return the sum as a linked list.
        //
        //You may assume the two numbers do not contain any leading zero, except the number 0 itself.
        //https://www.youtube.com/watch?v=qE9KOe3Fu7Q


        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        ListNode node8 = new ListNode(9);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(9);
        ListNode node11 = new ListNode(9);

       node8.next = node9;
       node9.next = node10;
       node10.next = node11;

        System.out.println(addTwoNumbers(node1, node4));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        ListNode head3 = new ListNode();
        ListNode temp = head3;
        int carry = 0;

        while (l1 != null || l2 != null){

            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            head3.next = new ListNode(sum % 10);
            head3 = head3.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

        }

        if(carry == 1) head3.next = new ListNode(carry);

        return ListNode.print(temp.next);
    }
}
