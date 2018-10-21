package pl.sda;

public class CustomLinkedList<T> {

    private CustomLinkedList<T> next;
    private CustomLinkedList<T> prev;
    private T value;

    public CustomLinkedList(T value) {
        this.value = value;
        next = prev = null;
    }

    public void add(CustomLinkedList<T> newElement) {

        CustomLinkedList last = this;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newElement;
        newElement.prev = last;
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

        head.print();
        //head.print();
    }
}
