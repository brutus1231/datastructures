package pl.sda;

import java.util.LinkedList;

public class CustomQueue<T> {
    private LinkedList<T> elements = new LinkedList<>();

    public void push(T element) {
        elements.addLast(element);
    }

    public T pop() {
        return elements.removeFirst();
    }

    public T front() {
        return elements.getLast();
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
        CustomQueue<Integer> queue1 = new CustomQueue<>();
        queue1.push(1);
        queue1.push(2);
        queue1.push(3);
        queue1.clear();

        CustomQueue<String> queue2 = new CustomQueue<>();
        queue2.push("ala ma kota");
        queue2.push("wiewiórka");
        queue2.push("programowanie");
        queue2.clear();
    }
}
