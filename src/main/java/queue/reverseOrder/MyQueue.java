package queue.reverseOrder;

import java.util.NoSuchElementException;

public class MyQueue <T>{
    QNode<T> front;
    QNode<T> back;

    int size;

    boolean isEmpty(){
        return front == null;
    }

    T peek(){
        return (T) front.value;
    }

    int size(){
        return size;
    }

    void enqueue(T item){
        QNode<T> node = new QNode<>(item);

        if(isEmpty()) {
            front = back = node;
        }
        else{
            back.next = node;
            back = node;
        }
        size++;
    }

    T dequeue(){
        QNode<T> frontNode;

        if(isEmpty()) throw new NoSuchElementException();
        if(front == back){
            frontNode = front;
            front = back = null;
        }else {
            frontNode = front;
            front = front.next;
        }
        size--;
        return (T)frontNode.value;
    }
}
