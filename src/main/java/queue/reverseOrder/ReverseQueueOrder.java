package queue.reverseOrder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueOrder {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));

       MyQueue<Integer> queue = new MyQueue<>();
       queue.enqueue(10);
       queue.enqueue(20);
       queue.enqueue(30);
       queue.enqueue(40);
       queue.enqueue(50);

       int numsOfElem = 4;

        System.out.println(reverseQueueOrder(queue, numsOfElem));

//        System.out.println(q);
    }

    public static MyQueue<Integer> reverseQueueOrder(MyQueue<Integer> queue, int k){

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
        return result;
    }

}
