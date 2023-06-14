package dsa_algos;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    static ListNode print(ListNode node){
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }

        return node;
    }
}
