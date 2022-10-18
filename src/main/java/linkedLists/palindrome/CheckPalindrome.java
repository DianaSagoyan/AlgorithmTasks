package linkedLists.palindrome;

public class CheckPalindrome {
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

        NodeList fast = head;
        NodeList slow = head;
        NodeList prev;
        NodeList next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        prev = slow;
        slow = slow.next;
        prev.next = null;

        while(slow != null){
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        fast = head;
        slow = prev;

        while(slow != null){
            if(slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
}
