class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is in Running state now.");
        try {
            Thread.sleep(1000); // moves to Timed Waiting state
            System.out.println("Thread woke up after sleep.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Thread is finishing and will enter Terminated state.");
    }
}

public class ThreadLifeCycleDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // New state
        System.out.println("Thread is in New state.");
        t1.start(); // Runnable state
        try {
            t1.join(); // main waits for t1 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting after child thread is done.");
    }
}
