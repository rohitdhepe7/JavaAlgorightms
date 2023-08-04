package LinkedLists;

public class Main {

    public static void main(String[] args) {
        SingleLinkedList sLL = new SingleLinkedList();
        sLL.createSingleLinkedList(1);
        /*
        sLL.insertInLinkedList(2, 1);
        sLL.insertInLinkedList(3, 3);
        sLL.insertInLinkedList(4, 4);
        sLL.insertInLinkedList(5, 6);
        sLL.traverseSinglyLinkedList();
        sLL.deleteNode(3);*/
        sLL.push(2);
        sLL.push(3);
        sLL.push(4);
        sLL.push(5);
        //System.out.println("Node Popped " + sLL.pop().value);
        sLL.traverseSinglyLinkedList();
        System.out.println("Prev head " + sLL.head.value);
        //sLL.rotate(2);
        //sLL.traverseSinglyLinkedList();
        //sLL.set(0,6);
        sLL.set(5,7);
        sLL.traverseSinglyLinkedList();
        sLL.set(2,8);
        sLL.traverseSinglyLinkedList();
        //sLL.traverseList();
    }
}
