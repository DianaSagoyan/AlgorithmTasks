package trees;

import java.util.NoSuchElementException;

public class MyTree {
    TNode root;

    void insert(int value){
        TNode newNode=new TNode(value);
        if (root==null) {
            root=newNode;
            return;
        }
        TNode current =root;
        while(true){
            if (value<= current.value){

                if (current.leftChild==null){
                    current.leftChild=newNode;
                    break;
                }
                current=current.leftChild;
            }
            else {
                if (current.rightChild==null){
                    current.rightChild=newNode;
                    break;
                }
                current=current.rightChild;
            }
        }
    }


    void inOrderTraversal(TNode root){
        if(root == null) throw new NoSuchElementException();

        inOrderTraversal(root.leftChild);
        System.out.println(root.value);
        inOrderTraversal(root.rightChild);
    }
}
