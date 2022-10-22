package linkedLists.add_two_numbers;

//
//You are given two non-empty linked lists representing two non-negative integers. The digits
// are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);

        node4.next = node5;
        node5.next = node6;

        System.out.println(addTwoNums(node1, node4));
    }

    public static ListNode addTwoNums(ListNode head1, ListNode head2){

        ListNode head3 = new ListNode();

        ListNode temp = head3;

        int carry = 0;

        while (head1 != null && head2 != null){

            int sum = head1.val + head2.val + carry;
            carry = sum / 10;

            head3.next = new ListNode(sum % 10);
            head3 = head3.next;
            head1 = head1.next;
            head2 = head2.next;

        }

        while (head1 != null){
            int sum = head1.val+ carry;
            carry = sum / 10;

            head3.next = new ListNode(sum % 10);
            head3 = head3.next;
            head1 = head1.next;
        }

        while (head2 != null){
            int sum = head2.val+ carry;
            carry = sum / 10;

            head3.next = new ListNode(sum % 10);
            head3 = head3.next;
            head2 = head2.next;
        }

        if(carry == 1) head3.next = new ListNode(carry);

        return temp.next;
    }
}
