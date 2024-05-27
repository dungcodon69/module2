package session_stack_queue.practice.stackarray;

import java.util.ArrayList;
import java.util.Stack;

public class MyStack<E> {
    Object[] arr;
    int size;
    int index = 0;

    public MyStack(int size) {
        this.arr = new Object[size];
        this.size = size;
    }


    public boolean isFull(){
        return index == size;
    }

    public void push(E element){
        if (isFull()) throw new StackOverflowError("Stack is Full");
        arr[index] = element;
        index++;
    }

    public boolean isEmpty(){
        return index == 0;
    }

    public E pop() throws Exception {
        if (isEmpty()) throw new Exception("Stack is null");
        return (E) arr[--index];
    }

    public int size(){
        return index;
    }



}
