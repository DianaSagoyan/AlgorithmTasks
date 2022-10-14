package linkedLists.reverse_nodeList_onePass;

public class MySinglyLinkedList {
    Node head;
    Node tail;

    boolean isEmpty(){
        return head == null;
    }

    void add(int data){
        Node node = new Node(data);

        if(isEmpty()) head = tail = node;
        else{
            tail.next = node;
            tail = node;
        }
    }

    void printNodes(){
        Node current = head;
        while (current != null){
            if(current.next == null) System.out.print(current.val + "=> null");
            else System.out.print(current.val + "=>");
            current = current.next;
        }

    }
}
