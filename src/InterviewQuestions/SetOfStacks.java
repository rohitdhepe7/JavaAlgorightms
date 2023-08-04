package InterviewQuestions;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class SetOfStacks {
    ArrayList<Stack> stacks = new ArrayList<>();
    public int capacity;

    public SetOfStacks(int capacity) {
        this.capacity = capacity;
    }

    //to get the top element first we have to find the last stack
    public Stack getLastStack() {
        if (stacks.size() == 0){
            return null;
        }
        return stacks.get(stacks.size() -1);
    }

    public void push(int value){
        Stack last = getLastStack();
        if (last != null && !last.isFull()){
            last.push(value);
        }else{
            Stack stack = new Stack(capacity);
            stack.push(value);
            stacks.add(stack);
        }
    }

    public int pop() {
        Stack last = getLastStack();
        if (last == null) throw new EmptyStackException();
        int result = last.pop();
        if (last.size == 0 ){
            stacks.remove(stacks.size() - 1);
        }
        return result;
    }

    //helper left shift
    public int leftShift(int index, boolean removeTop){
        Stack stack = stacks.get(index);
        int removedItem;
        if (removeTop){
            removedItem = stack.pop();
        }else{
            removedItem = stack.removeBottom();
        }
        return removedItem;
    }
}
