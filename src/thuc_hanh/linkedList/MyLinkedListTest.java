package thuc_hanh.linkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst("data");
        ll.addFirst("12");
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();

    }
}
