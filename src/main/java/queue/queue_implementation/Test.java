package queue.queue_implementation;

public class Test {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.dequeue()); // prints 1
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.isEmpty()); // prints false
        q.enqueue(5);
        System.out.println(q.dequeue()); // prints 2
        q.enqueue(6);
        System.out.println(q.peek()); // prints 3
    }
}
