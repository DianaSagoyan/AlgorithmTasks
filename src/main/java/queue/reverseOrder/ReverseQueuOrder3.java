package queue.reverseOrder;

import java.util.Stack;

public class ReverseQueuOrder3 {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        for (int i = 1; i < 6; i++) {
            queue.enqueue(i);
        }

        int numsOfElem = 3;

        reverseQueueOrder(queue, numsOfElem).print();
    }

    public static MyQueue<Integer> reverseQueueOrder(MyQueue<Integer> queue, int k){
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++){
            stack.push(queue.dequeue());
        }

        while (!stack.isEmpty()){
            queue.enqueue(stack.pop());
        }

        for (int i = 0; i < queue.size - k; i++) {
            queue.enqueue(queue.dequeue());
        }
        return queue;
    }
}
