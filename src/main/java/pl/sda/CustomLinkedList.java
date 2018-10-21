package pl.sda;

public class CustomLinkedList<T> {

    private CustomLinkedList<T> next;
    private CustomLinkedList<T> prev;
    private T value;
    private int size;

    public CustomLinkedList(T value) {
        this.value = value;
        size = 0;
        next = prev = null;
    }

    public void add(CustomLinkedList<T> newElement) {
        CustomLinkedList last = this;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newElement;
        newElement.prev = last;
        size++;
    }

    public CustomLinkedList<T> remove(CustomLinkedList<T> element) {

        if (this.value == element.value) {
            return this.next;
        }

        //do dopisania usuwanie elementu w środku listy
        return this;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        CustomLinkedList temp = this;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        CustomLinkedList<Integer> head = new CustomLinkedList<>(1);

        head.add(new CustomLinkedList<>(2));
        head.add(new CustomLinkedList<>(3));

        head = head.remove(new CustomLinkedList<>(2));

        head.print();
    }
}
