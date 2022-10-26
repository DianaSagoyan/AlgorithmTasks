package queue.reverseOrder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueOrder2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        int numberOfElems = 4;

        System.out.println(reverseQueueOrder(queue, numberOfElems));
    }

    public static Queue<Integer> reverseQueueOrder(Queue<Integer> queue, int k){

        Queue<Integer> result = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) result.add(stack.pop());

        while (!queue.isEmpty()) result.add(queue.remove());

        return result;
    }
}
