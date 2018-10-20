package pl.sda;

import java.util.LinkedList;

public class CustomStack<T> {

    private LinkedList<T> elements = new LinkedList<>();

    public void push(T element) {
        elements.addFirst(element);
    }

    public T pop() {
        return elements.removeFirst();
    }

    public T pick() {
        return elements.getFirst();
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    public void clear() {
        while (!elements.isEmpty()) {
            T element = elements.pop();
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>();

    }
}
