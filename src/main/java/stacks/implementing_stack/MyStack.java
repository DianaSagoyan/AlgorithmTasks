package stacks.implementing_stack;

import java.util.NoSuchElementException;

public class MyStack<T> {
    SNode<T> top;
    SNode<T> bottom;
    int size;

    public boolean isEmpty(){
        return bottom == null;
    }

    public int size(){
        return size;
    }

    public T peek(){
        return top.value;
    }

    public void push(T item){
        SNode<T> node = new SNode<>(item);
        if(isEmpty()) top = bottom = node;
        else {
            top.next = node;
            top = node;
        }
        size++;
    }

    public T pop(){
        SNode<T> poppingItem = top;
        if(isEmpty()) throw new NoSuchElementException();
        if(top == bottom){
            poppingItem = top;
            top = bottom = null;
        }else{
            SNode current = bottom;
            poppingItem = top;
            while (current.next != top) current = current.next;
            current.next = null;
            top = current;
        }
        size--;
        return poppingItem.value;
    }
}
