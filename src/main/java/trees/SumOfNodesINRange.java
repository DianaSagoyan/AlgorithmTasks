package trees;

public class SumOfNodesINRange {
    public static void main(String[] args) {
        TNode root = new TNode(9, new TNode(5, new TNode(3), new TNode(6)), new TNode(10));

        VisualizeTree.printTree(root, null, false);

        int low = 5, high = 9;

        System.out.println(sumOfRange(root, low, high));
    }

    public static int sumOfRange(TNode root, int low, int high){
        int sum = 0;
        if(root == null) return 0;
        if(root.value <= high && root.value >= low) sum += root.value;

        return sum + sumOfRange(root.rightChild, low, high) + sumOfRange(root.leftChild, low, high);
    }
}
