package trees;

public class TNode {
    int value;
    TNode leftChild;
    TNode rightChild;

    public TNode(int value) {
        this.value = value;
    }

    public TNode(int value, TNode leftChild, TNode rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public TNode(int value, TNode leftChild) {
        this.value = value;
        this.leftChild = leftChild;
    }



}
