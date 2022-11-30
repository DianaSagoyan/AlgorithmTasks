package trees;

import java.util.ArrayList;
import java.util.Arrays;

public class LowestCommonAncestor {
    public static void main(String[] args) {
//        TNode root = new TNode(6, new TNode(2, new TNode(0), new TNode(4, new TNode(3), new TNode(5))), new TNode(8, new TNode(7), new TNode(9)));
////        TNode root = new TNode(2, new TNode(1));
//        VisualizeTree.printTree(root, null, false);
//
//        TNode p = new TNode(2), q = new TNode(8);
//        System.out.println(lowestCommonAncestor(root, p, q));

        ArrayList<Integer> treeData = new ArrayList<>(Arrays.asList(2, 1, 3));
        int p = 3,
                q = 1;

        MyBST tree = new MyBST();

        for (Integer each : treeData) {
            tree.insert(each);
        }
        VisualizeTree2.printTree(tree.root, null, false);

        System.out.println("\nFor nodes " + p + " and " + q + " LCA is  " +
                lowestCommonAncestor(tree.root, tree.nodeByVal(p), tree.nodeByVal(q))
        );
    }

    public static int lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){


        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root.val;
    }
}
