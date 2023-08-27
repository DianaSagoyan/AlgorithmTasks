package dsa_algos;

public class Task68_ReverseLinkedList {
    public static void main(String[] args) {
        //Given the head of a singly linked list, reverse the list, and return the reversed list.

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        reverseLinkedList(node1);
    }

    public static void reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        ListNode.print(head);
    }
}
