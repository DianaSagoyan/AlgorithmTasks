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
                    // if left is null insert there!!!
                    current.leftChild=newNode;
                    break;
                }
                //if leftChild is not null branch into left subtree!!
                current=current.leftChild;
            }
            else {
                if (current.rightChild==null){
                    // if right is null insert there!!!
                    current.rightChild=newNode;
                    break;
                }
                //if rightChild is not null branch into right subtree!!
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
