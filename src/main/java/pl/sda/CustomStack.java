package pl.sda;

import java.util.LinkedList;

public class CustomStack<T> {

    private LinkedList<T> elements;

    public void push(T element) {
        elements.addLast(element);
    }

    public T pop() {
        return elements.removeLast();
    }

    public T pick() {
        return elements.getLast();
    }

    public void clear() {

    }

    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>();

    }
}
