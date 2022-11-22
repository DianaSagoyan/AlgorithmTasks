package trees;

public class SameTree {
    public static void main(String[] args) {
        TNode root1 = new TNode(9,
                new TNode(8, new TNode(7), new TNode(3)),
                new TNode(5)
        );
        VisualizeTree.printTree(root1, null, false);
        TNode root2 = new TNode(9,
                new TNode(8, new TNode(7), new TNode(3)),
                new TNode(5)
        );
        VisualizeTree.printTree(root2, null, false);

        System.out.println("The same?  " + sameTree(root1, root2));
    }

    public static boolean sameTree(TNode p, TNode q){
        if(p == null && q == null) return true;

        if(p != null && q == null || q != null && p == null) return false;

        if(p.value != q.value) return false;

        return sameTree(p.leftChild, q.leftChild) && sameTree(p.rightChild, q.rightChild);
    }
}
