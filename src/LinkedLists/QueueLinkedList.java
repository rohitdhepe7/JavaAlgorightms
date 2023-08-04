package LinkedLists;

public class QueueLinkedList {

    public static void main(String[] args) {
        QueueLinkedList queueLinkedList = new QueueLinkedList();
        queueLinkedList.enQueue(5);
        queueLinkedList.enQueue(12);
        queueLinkedList.enQueue(34);
//        System.out.println(queueLinkedList.head.value);
        System.out.println(queueLinkedList.head.next.value);
//        System.out.println(queueLinkedList.prevNode.next.value);
        int result = queueLinkedList.peek();
        System.out.println("First element " + result);

    }

    Node head;
    Node tail;
    Node prevNode;
    int size;

    //isEmpty
    public boolean isEmpty(){
        if (head == null){
            System.out.println("The Queue is empty");
            return true;
        }else {
            return false;
        }
    }

    //delete
    public void deleteQueue(){
        head = null;
        tail = null;
        System.out.println("Queue is deleted successfully!");
    }

    public void enQueue(int nodeValue){
        if (head == null){
            Node node = new Node();
            node.value = nodeValue;
            head = node;
            tail = node;
            prevNode = node;
            node.next = null;
            size = 1;
            System.out.println("First node with value " + nodeValue + " is created");
        }else {
            Node newNode = new Node();
            newNode.value = nodeValue;
            newNode.next = null;
            tail = newNode;
            tail.next = newNode;
            size++;
            System.out.println("A new node with value "+ nodeValue + " is created");
        }
    }

    public int peek(){
        return head.value;
    }

}
