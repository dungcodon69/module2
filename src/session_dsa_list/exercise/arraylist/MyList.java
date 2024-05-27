package session_dsa_list.exercise.arraylist;

import java.util.Arrays;
import java.util.List;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENTDATA = {};

    private Object[] elementData;
    private int size = 0;

    public MyList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            elementData = new Object[capacity];
        } else if (capacity == 0) elementData = EMPTY_ELEMENTDATA;
        else{
            throw new IllegalArgumentException("Illegal capacity: " + capacity);
        }
    }

    public void add(E e){
        if (size == elementData.length) {
            ensureCapa();
        }
        elementData[size++] = e;
    }

    private void ensureCapa() {
        int newLength = elementData.length * 2;
        elementData = Arrays.copyOf(elementData,newLength);
    }

    public E get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elementData[index];
    }




}
