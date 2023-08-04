package LinkedListQuestions;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLinkedList(1);
        ll.insertNode(9);
        ll.insertNode(5);
        ll.insertNode(10);
        ll.insertNode(2);
        ll.traversalLL();
        Questions questions = new Questions();
        //Node n = questions.nthToLast(ll, 2);
        LinkedList t = questions.partition(ll, 4);
        t.traversalLL();
    }
}
