class thread1 extends Thread {
    public void run() {
        System.out.println("Hello from thread1 (Priority: " + getPriority() + ")");
    }
}

class thread2 extends Thread {
    public void run() {
        System.out.println("World from thread2 (Priority: " + getPriority() + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        t1.setPriority(Thread.MAX_PRIORITY); // Prioritize thread1
        t2.setPriority(Thread.MIN_PRIORITY); // Optional: Set low priority for thread2

        t1.start();
        t2.start();
    }
}


