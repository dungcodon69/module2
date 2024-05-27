package session_stack_queue.practice.stacklinkedlist;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        this.stack = new LinkedList<>();
    }

    public void push(T t){
        stack.addFirst(t);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }





}
