package doublylinkedlist;

public class DoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    public DoublyNode createDLL(int nodeValue) {
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;
        node.next = null;
        node.prev = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    /*
     * Insertion in doubly linked list
     * 1. Insert at the beginning of the linked list
     * 2. Insert at the specified location of the linked list
     * 3. Insert at the end of the linked list
     * */

    public void insertDLL(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        //insert a node at the beginning of the linked list
        if (head == null) {
            createDLL(nodeValue);
        } else if (location == 0) {
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            size++;
        } else if (location >= size) {
            // insert a node at the end of the linked list
            //next reference of the last node is always null
            newNode.next = null;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    //traverse through the doubly linked list
    public void traverseDLL(){
        if (head != null){
            DoublyNode node = head;
            for (int i = 0; i < size; i++) {
                System.out.print(node.value);
                if (i != size-1){
                    System.out.print(" -> ");
                }
                node = node.next;
            }
        }else{
            System.out.println("Linked list does not exist");
        }
        System.out.println("\n");
    }
}
