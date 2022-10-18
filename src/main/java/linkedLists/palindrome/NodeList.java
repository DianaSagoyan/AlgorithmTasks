package linkedLists.palindrome;


public class NodeList {
    int val;
    NodeList next;

    public NodeList() {
    }

    public NodeList(int val) {
        this.val = val;
    }

    public NodeList(int val, NodeList next) {
        this.val = val;
        this.next = next;
    }
}
