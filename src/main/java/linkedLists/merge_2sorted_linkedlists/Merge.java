package linkedLists.merge_2sorted_linkedlists;

import java.util.Arrays;
import java.util.List;

public class Merge {
    public static void main(String[] args) {

        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();

        list1.val = 1;
        list1.next = new ListNode(2);
        list1.next = new ListNode(3);

        list2.val = 1;
        list2.next = new ListNode(4);
        list2.next = new ListNode(5);

        System.out.println(List.of(mergeTwoLists(list1, list2)));
    }

    public static ListNode mergeTwoLists(ListNode curr1, ListNode curr2){

        //dummy head node
        ListNode tempHead = new ListNode();
        ListNode previous = tempHead;

        while (curr1 != null && curr2 != null){
            if(curr1.val <= curr2.val){
                previous.next = curr1;
                curr1 = curr1.next;
            }else{
                previous.next = curr2;
                curr2 = curr2.next;
            }

            previous = previous.next;
        }

        //check if any leftover
        if(curr1 == null) previous.next =curr2;
        else previous.next =curr1;

        return tempHead.next;
    }
}
