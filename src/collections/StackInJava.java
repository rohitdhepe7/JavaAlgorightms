package collections;

import java.util.Stack;

public class StackInJava {

    public static void main(String[] args) {
        String name = "Sachin";
        name = name.concat(" Tendulkar");
        System.out.println(name);

    }

    public void stackExample(){
        // Creating an empty Stack
        Stack<String> stack = new Stack<>();

        stack.push("item 1");
        stack.push("item 2");
        stack.push("item 3");
        stack.push("item 4");
        stack.push("item 5");

        /*stack.add("item 1");
        stack.add("item 2");
        stack.add("item 3");
        stack.add("item 4");
        stack.add("item 5");*/

        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);

        // Removing elements using pop() method
        System.out.println("Popped element: " +
                stack.pop());
        System.out.println("Popped element: " +
                stack.pop());

        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation "
                + stack);
    }
}
