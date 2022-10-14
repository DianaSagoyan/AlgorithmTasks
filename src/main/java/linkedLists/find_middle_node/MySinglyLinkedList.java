package linkedLists.find_middle_node;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    Node current;

    boolean isEmpty(){
        return head == null;
    }

    void add(int data){
        Node node = new Node(data);
        if(isEmpty()) head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
    }
}
