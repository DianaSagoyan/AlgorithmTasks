package linkedLists.intersectionOfLinkeLists;

public class FindIntersection {
    public static void main(String[] args) {


        Node node1 = new Node(4);
        node1.next = new Node(1);
        node1.next.next = new Node(8);
        node1.next.next.next = new Node(4);
        node1.next.next.next.next = new Node(5);

        Node node3 = node1.next.next;
        Node node4 = node1.next.next.next;
        Node node5 = node1.next.next.next.next;


        Node node6 = new Node(5);
        node6.next = new Node(7);
        node6.next.next = new Node(1);
        node6.next.next.next = node3;
        node6.next.next.next.next = node4;
        node6.next.next.next.next.next = node5;


        System.out.println(listIntersection(node1,node6).val);

    }

    public static Node listIntersection(Node head1, Node head2){

        if(head1 == null || head2 == null) return null;
        Node p1 = head1;
        Node p2 = head2;

        while (p1 != p2){
            p1 = (p1 != null) ? p1.next : head2;
            p2 = (p2 != null) ? p2.next : head1;
        }
        return p1;
    }
}


//https://www.youtube.com/watch?v=u4FWXfgS8jw   12:17   time complexity O(n)
