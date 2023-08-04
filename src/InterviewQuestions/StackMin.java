package InterviewQuestions;

public class StackMin {
    int[] arr;
    int size = 0;
    int minValue;


    public StackMin() {
        // TODO
        arr = new int[3];
    }

    public boolean isEmpty(){
        if (size == 0){
            System.out.println("The stack is empty");
            return true;
        }else{
            return false;
        }
    }

    //push
    public void push(int value){
        if (isEmpty()){
            minValue = value;
        }
        if (value < minValue){
            minValue = value;
        }
        arr[size] = value;
        size++;
    }

    public int pop(){
        int value = arr[size - 1];
        size--;
        return value;
    }

    public int min(){
       return minValue;
    }
}
