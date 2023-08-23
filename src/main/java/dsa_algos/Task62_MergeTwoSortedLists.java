package dsa_algos;

public class Task62_MergeTwoSortedLists {
    public static void main(String[] args) {
        //You are given the heads of two sorted linked lists list1 and list2.
        //
        //Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
        //
        //Return the head of the merged linked list.

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;

        node4.next = node5;
        node5.next = node6;

        mergeTwoSortedLists(node1, node4);
    }

    public static void mergeTwoSortedLists(ListNode list1, ListNode list2){
        ListNode temp = new ListNode(0);
        ListNode current = temp;


        while (list1 != null && list2 != null){

            if(list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 != null) current.next = list1;
        if(list2 != null) current.next = list2;

        System.out.println(ListNode.print(temp.next));
    }
}
