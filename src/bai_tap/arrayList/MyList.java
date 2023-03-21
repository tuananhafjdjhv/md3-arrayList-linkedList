package bai_tap.arrayList;

import java.util.Arrays;


public class MyList<E> {
    int size = 0;
    static final int DEFAU_OPACITY = 10;
    Object elements[];


    public MyList(int capacity) {
    }

    public MyList() {
        elements = new Object[DEFAU_OPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    void add(E e) {

        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    void add(int index, E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        for (int i = size - 1; i >= index; i++) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ",size: " + i);
        }
        return (E) elements[i];
    }

    public E remove(int index) {
        elements[index] = null;
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        return (E) elements[index];
    }

    public MyList<E> clone() {
        MyList newElement = new MyList();
        for (int i = 0; i < size; i++) {
            newElement.add((E) elements[i]);
        }
        return (MyList<E>) newElement;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public boolean indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
