package stacks.implementing_stack;

public class SNode<T> {
    T value;
    SNode<T> next;

    public SNode(T value) {
        this.value = value;
    }
}
