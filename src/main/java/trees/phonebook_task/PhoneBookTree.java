package trees.phonebook_task;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class PhoneBookTree {

    CustomerNode root;
    List<String> result = new ArrayList<>();

    void insert(CustomerNode newNode){

        if(root == null){
            root = newNode;
            return;
        }

        CustomerNode current = root;

        while(true){

            if(newNode.firstName.compareToIgnoreCase(current.firstName) < 0){
                if(current.leftChild == null){
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

    void printNamesInAscOrder(CustomerNode root){

    }
    List<String> firstNamesList(CustomerNode root) { // This is an In Order Traversal Iteratively

            if(root == null) return null;
            firstNamesList(root.leftChild);
            result.add(root.firstName);
            firstNamesList(root.rightChild);

        // return size or number of entries in the phonebook
        return result;
    }

}