package linkedLists.intersectionOfLinkeLists;

public class MySinglyLinkedList {
    Node head;
    Node tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void add(int data){
        Node node = new Node(data);

        if(isEmpty()){
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public int linkedListLength(){
        int count = 0;
        Node pointer = head;

        while (pointer != null){
            count++;
            pointer = pointer.next;
        }
        return count;
    }
}
