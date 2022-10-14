package linkedLists.find_middle_node;

public class FindMIddleNode {
    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }

        printMiddle(list);
    }

    public static void printMiddle(MySinglyLinkedList list){
        //two pointers
        Node p1 = list.head;
        Node p2 = list.head;

        while (p2 != list.tail && p2.next != list.tail){
            p1 = p1.next;
            p2 = p2.next.next;
        }

        if(p2 == list.tail) System.out.println(p1.val);
        else System.out.println(p1.val + ", " + p1.next.val);

    }
}
