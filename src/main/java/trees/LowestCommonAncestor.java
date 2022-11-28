package trees;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        TNode root = new TNode(6, new TNode(2, new TNode(0), new TNode(4, new TNode(3), new TNode(5))), new TNode(8, new TNode(7), new TNode(9)));
//        TNode root = new TNode(2, new TNode(1));
        VisualizeTree.printTree(root, null, false);

        TNode p = new TNode(2), q = new TNode(8);
        System.out.println(lowestCommonAncestor(root, p, q));
    }

    public static int lowestCommonAncestor(TNode root, TNode p, TNode q){

        if(p.value <= root.value && q.value > root.value){
            return root.value;
        } else if(p.value < root.value && q.value < root.value){
            return lowestCommonAncestor(root.leftChild, p, q);
        } else{
            return lowestCommonAncestor(root.rightChild, p, q);
        }
    }
}
