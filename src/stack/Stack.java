package stack;

import LinkedLists.SingleLinkedList;

public class Stack {

    SingleLinkedList linkedList;

    public static void main(String[] args) {
        /*Stack stack = new Stack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        int result = stack.peek();
        System.out.println(result);
        int result1 = stack.peek();
        System.out.println(result1);
*/

        //Stack usingLinked list
        Stack stack = new Stack();
        stack.pushLinkedList(1);
        stack.pushLinkedList(2);
        stack.pushLinkedList(3);
        int result = stack.peekLinkedList();
        System.out.println(result);
        int result1 = stack.peekLinkedList();
        System.out.println(result1);


    }

    int[] arr;
    int topOfStack;

    //create a stack
    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack with size " + size + " is successfully created");
    }

    public Stack(){
        linkedList = new SingleLinkedList();

    }

    //isEmpty
    public boolean isEmpty(){
        if (topOfStack == -1){
            return true;
        }else {
            return false;
        }
    }

    //isFull
    public boolean isFull(){
        if (topOfStack == arr.length - 1){
            return true;
        }else {
            return false;
        }
    }

    // push
    public void push(int value){
        if (isFull()){
            System.out.println("The stack is full");
        }else{
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }else{
            return arr[topOfStack];
        }
    }

    //delete
    public void deleteStack(){
        arr = null;
        System.out.println("Stack deleted successfully");
    }

    public void pushLinkedList(int value){
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted value " + value +" in the stack");
    }

    public boolean isEmptyLinkedList(){
        if (linkedList.head == null){
            System.out.println("The stack is empty");
            return true;
        }else{
            return false;
        }
    }

    public int popFromLinkedList(){
        int result = -1;
        if (isEmptyLinkedList()){
            System.out.println("The stack is empty");
        }else{
            result = linkedList.head.value;
            linkedList.deleteNode(0);
        }
        return result;
    }

    public int peekLinkedList() {
        if (isEmptyLinkedList()){
            System.out.println("The stack is empty");
            return -1;
        }else{
            return linkedList.head.value;
        }
    }

    public void deleteLLStack(){
        linkedList.head = null;
        System.out.println("The stack is deleted");
    }
}
