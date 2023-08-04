package LinkedLists;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //insert method SinglyLinkedList
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head == null){
            createSingleLinkedList(nodeValue);
            return;
        }else if (location == 0){
            node.next = head;
            head = node;
        }else if(location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }else {
            Node tempNode = head;
            int index = 0;
            while(index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            node.next = nextNode;
        }
        size++;
    }

    public void push(int nodeValue){

        if (head == null) {
            createSingleLinkedList(nodeValue);
        }else {
            Node node = new Node();
            node.value = nodeValue;
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public Node pop(){
        if (head == null){
            return null;
        }
        Node removeNode;
        Node currentNode;
            if (head == tail){
                removeNode = head;
                head = tail = null;
            }else {
                currentNode = head;
                while (currentNode != tail){
                    currentNode = currentNode.next;
                }
                removeNode = currentNode.next;
                currentNode.next = null;
                tail = currentNode;
            }

        size--;
        return removeNode;
    }

    public void traverseSinglyLinkedList(){
        if (head == null){
            System.out.println("SLL does not exist");
        }else{
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }

    //search for a node value
    boolean searchNode(int nodeValue){
        if (head != null){
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue){
                    System.out.print("Found the node at location " + i+"\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    //deleting a node from singly linked list
    public void deleteNode(int location){
        if (head == null){
            System.out.println("The Singly Linked list does not exist");
        }else if (location == 0){
            head = head.next;
            size--;
            if(size == 0){
                tail = null;
            }
        }else if (location >= size){
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head){
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public String rotate(int number){
        int index = number;
        if (number < 0){
            index = number + size;
        }

        if (index < 0 || index >= size){
            return null;
        }

        if (index == 0){
            return "No Rotation";
        }

        Node prevNode = head;
        for (int i = 0; i < index - 1; i++) {
            prevNode = prevNode.next;
        }

        if (prevNode == null){
            return "No Rotation";
        }

        tail.next = head;
        head = prevNode.next;
        tail = prevNode;
        prevNode.next = null;
        return "Success";

    }

    public boolean set(int index, int value){
        Node newNode = new Node();
        newNode.value = value;
        if (index == 0){
            newNode.next = head.next;
            head = newNode;
        }else if (index == size){
            Node prevNode = head;
            for (int i = 1; i < size - 1; i++) {
                prevNode = prevNode.next;
            }
            System.out.println("prev node "+ prevNode.value);
            prevNode.next = newNode;
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
        }else {
            Node tempNode = head;
            int location = 0;
            while(location < index - 1){
                tempNode = tempNode.next;
                location++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = newNode;
            newNode.next = nextNode.next;
        }
        return true;
    }

    public void traverseList(){
        Node node = head;
        for (int i = 1; i < size - 1; i++) {
            node = node.next;
        }
        System.out.println("Prev Node " + node.value);
    }
}
