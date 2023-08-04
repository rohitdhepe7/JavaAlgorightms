package circulardoublelinkedlist;

import doublylinkedlist.DoublyNode;

public class CircularDoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    //create a circular doubly linked list
    public DoublyNode createCDLL(int nodeValue) {
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;
        head = node;
        tail = node;
        node.next = node;
        node.prev = node;
        size = 1;
        return head;
    }

    //insert node in circular doubly linked list
    public void insertCDLL(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createCDLL(nodeValue);
            return;
        } else if (location == 0) {
            //first update the next and prev references of the newly created node
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoublyNode currentNode = head;
            int index = 0;
            while (index < location - 1) {
                currentNode = currentNode.next;
                index++;
            }
            newNode.prev = currentNode;
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    public void traverseCDLL(){
        if (head!=null){
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        }else {
            System.out.println("SDLL does not exist");
        }
    }

    public void reverseTraverseCDLL(){
        if (head!=null){
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.prev;
            }
            System.out.println("\n");
        }else {
            System.out.println("SDLL does not exist");
        }
    }
}
