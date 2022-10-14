package linkedLists.reverse_nodeList_onePass;

public class ReverseLinkedList {
    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();

        for (int i = 1; i < 10; i++) list.add(i);
            System.out.println("Before reverse");
            list.printNodes();
            System.out.println("\nAfter reverse");
            reverse(list);
            list.printNodes();

    }

    public static void reverse(MySinglyLinkedList list){
        Node previous = list.head;
        Node current = list.head.next;

        while (current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        list.tail = list.head;
        list.tail.next = null;
        list.head = previous;
    }
}
