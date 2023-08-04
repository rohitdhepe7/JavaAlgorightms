package threads;

public class Thread1 extends Thread{

    public Thread1(Runnable target, String name) {
        super(target, name);
    }

    @Override
    public void run() {
        int i = 0;
        while(i<12){
            System.out.println("Thread 1 is running");
            i++;
        }
    }
}
