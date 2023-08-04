package InterviewQuestions;

import java.util.Stack;

public class QueueViaStack {

    public static void main(String[] args) {
        QueueViaStack newQueue = new QueueViaStack();
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        System.out.println(newQueue.peek());
        newQueue.enqueue(4);
        System.out.println(newQueue.peek());
    }

    Stack<Integer> stackNewest, stackOldest;

    public QueueViaStack() {
        stackNewest = new Stack<>();
        stackOldest = new Stack<>();
    }

    public int size() {
        return stackNewest.size() + stackOldest.size();
    }

    public void enqueue(int value) {
        stackNewest.push(value);
    }

    private void shiftStacks(){
        if (stackOldest.isEmpty()){
            while(!stackNewest.isEmpty()){
                int poppedOut = stackNewest.pop();
                stackOldest.push(poppedOut);
            }
        }
    }

    public int dequeue(){
        shiftStacks();
        return stackOldest.pop();
    }

    public int peek(){
        shiftStacks();
        return stackOldest.peek();
    }
}
