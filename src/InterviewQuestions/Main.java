package InterviewQuestions;

public class Main {

    public static void main(String[] args) {
       SetOfStacks setOfStacks = new SetOfStacks(3);
       setOfStacks.push(1);
       setOfStacks.push(2);
       setOfStacks.push(3);
       setOfStacks.push(4);
       setOfStacks.push(5);
       System.out.println(setOfStacks.pop());


    }

    public void stackMinProblem(){
        StackMin stackMin = new StackMin();
        stackMin.push(34);
        stackMin.push(5);
        stackMin.push(8);
        int minValue = stackMin.min();
        System.out.println(minValue);
    }
}
