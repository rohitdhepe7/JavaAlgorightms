package threads;

public class ThreadExample {

    public static void main(String[] args) {

        MyThreadRunnable runnable1 = new MyThreadRunnable();
        MyThreadRunnable2 runnable2 = new MyThreadRunnable2();

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();


        Thread1 t1 = new Thread1(runnable1,"harry");
        Thread2 t2 = new Thread2(runnable2, "tom");
        System.out.println("Thread1 name: " + t1.getThreadGroup());
        System.out.println("Thread2 name: " + t2.getName());
        t1.start();
        t2.start();
    }
}
