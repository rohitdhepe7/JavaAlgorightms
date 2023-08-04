package circulardoublelinkedlist;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(12);
        cdll.insertCDLL(23, 0);
        cdll.insertCDLL(34, 1);
        cdll.insertCDLL(44, 3);
        //System.out.println(cdll.head.value);
        cdll.traverseCDLL();
        cdll.reverseTraverseCDLL();
    }
}
