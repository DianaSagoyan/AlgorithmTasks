package dsa_algos;

public class Task45_MinimumAbsoluteValueInBST {

    Integer prev;
    int min = Integer.MAX_VALUE;

    public int getMinDifference(TreeNode root){
        prev = null;
        inOrder(root);
        return min;
    }

    public void inOrder(TreeNode node){
        if(node == null) return;

        inOrder(node.left);

        if(node != null){
            min = Math.min(min, Math.abs(prev = node.val));
        }
        prev = node.val;

        inOrder(node.right);
    }
}
