package queue.reverseOrder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueOrder {
    public static void main(String[] args) {

       MyQueue<Integer> queue = new MyQueue<>();
       queue.enqueue(10);
       queue.enqueue(20);
       queue.enqueue(30);
       queue.enqueue(40);
       queue.enqueue(50);

       int numsOfElem = 4;

        reverseQueueOrder(queue, numsOfElem);

    }

    public static void reverseQueueOrder(MyQueue<Integer> queue, int k){

        MyQueue<Integer> result = new MyQueue<>();
        Stack<Integer> stack = new Stack<>();

        int count = 0;

        while (count < k){
            stack.push(queue.dequeue());
            count++;
        }

        while(!stack.isEmpty()){
            result.enqueue(stack.pop());
        }

       while (!queue.isEmpty()){
           result.enqueue(queue.dequeue());
       }
        result.print();
    }

}
