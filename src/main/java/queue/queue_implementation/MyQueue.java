package queue.queue_implementation;

import java.util.NoSuchElementException;
import java.util.Stack;

public class MyQueue<T> {
    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();

    boolean isEmpty(){
        return stack1.isEmpty();
    }

    T peek(){
        return stack1.peek();
    }

    void enqueue(T value){

        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        stack1.push(value);

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    T dequeue(){
        if(isEmpty()) throw new NoSuchElementException("Empty");

        T popped =  stack1.peek();
           stack1.pop();
        return popped;

    }
}
