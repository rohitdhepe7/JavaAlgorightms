package doublylinkedlist;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(1);
        dll.insertDLL(2, 0);
        dll.insertDLL(3, 2);
        dll.insertDLL(4, 3);

        System.out.println(dll.head.value);
        dll.traverseDLL();
    }
}
