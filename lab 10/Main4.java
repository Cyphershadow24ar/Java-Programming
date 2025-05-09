class thread1 extends Thread {
    public void run() {
        System.out.println("Hello from thread1");
    }
}

public class Main4 {
    public static void main(String[] args) {
        thread1 t1 = new thread1();

        t1.start(); // Start the thread (valid)

        try {
            t1.join(); // Wait until thread1 finishes
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Trying to start thread1 again...");

        try {
            t1.start(); // ❌ Illegal attempt to restart
        } catch (IllegalThreadStateException e) {
            System.out.println("Error: " + e);
        }
    }
}



