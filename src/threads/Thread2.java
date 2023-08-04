package threads;

public class Thread2 extends Thread{

    public Thread2(Runnable target, String name) {
        super(target, name);
    }

    @Override
    public void run() {
        int i = 0;
        while(i<12){
            System.out.println("Thread 2 is running");
            i++;
        }
    }
}
