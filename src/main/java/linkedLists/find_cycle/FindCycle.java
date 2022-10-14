package linkedLists.find_cycle;

import java.util.HashSet;
import java.util.Set;

public class FindCycle {
    public static void main(String[] args) {
        Node n1 = new Node(3);
        Node n2 = new Node(2);
        Node n3 = new Node(0);
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n2;
        n4.next = null;

        System.out.println(hasCycle(n1));
    }

    public static boolean hasCycle(Node node){
        Set<Node> set = new HashSet<>();

        while (node != null){
            if(set.contains(node)) return true;
            set.add(node);
            node = node.next;
        }
        return false;
    }
}
