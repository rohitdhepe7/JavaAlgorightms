public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public static void main(String[] args) {
        QueueArray  queueArray = new QueueArray(3);
        queueArray.enqueue(1);
        queueArray.enqueue(2);
        queueArray.enqueue(3);
        queueArray.delete();
    }

    public QueueArray(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The queue of size " + size + " is creates successfully!");
    }

    //is full
    public boolean isFull(){
        if (topOfQueue == arr.length-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        if (beginningOfQueue == -1 || beginningOfQueue == arr.length-1){
            System.out.println("The queue is empty");
            return true;
        }else {
            return false;
        }
    }

    //Enqueue
    public void enqueue(int value){
        if (isFull()){
            System.out.println("The queue is full");
        }else if (isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Value " + value +" is successfully inserted in queue");
        } else{
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Value " + value + " is successfully inserted in queue");
        }
    }

    //dequeue
    public int deQueue(){
        if (isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }else{
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue){
                beginningOfQueue = -1;
                topOfQueue = -1;
            }
            return result;
        }
    }

    public int peek(){
        if (!isEmpty()){
            return arr[beginningOfQueue];
        }else{
            System.out.println("The queue is empty");
            return -1;
        }
    }

    public void delete(){
        arr = null;
        System.out.println("Queue is successfully deleted");
    }
}
